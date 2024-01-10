package ru.otus.tests.unit;
import ru.otus.game.*;

import java.util.Objects;

public class GameTest {

    Player gamer;
    int usageNumberDiceRoll = 0;

    private class DiceImplTestImpl2 implements Dice{

        @Override
        public int roll() {
            if (usageNumberDiceRoll == 0){
                usageNumberDiceRoll+=1;
                return 1;
            }
            else {
                usageNumberDiceRoll = 0;
                return 2;
            }
        }
    }

    private class DiceImplTestImpl implements Dice{

        @Override
        public int roll() {
            return 1;
        }
    }
    private class GameWinnerPrinterTestIpml implements GameWinnerPrinter{

        @Override
        public void printWinner(Player winner) {
            gamer = winner;
        }
    }

    public void playGameTestEqualDiceRoll(){
        String scenario  = "Game.playGame test for equal dice.roll";
        try{
            //Две заглушки stub
            Dice dice = new DiceImplTestImpl ( );
            GameWinnerPrinter winnerPrinter = new GameWinnerPrinterTestIpml();

            Game game = new Game(dice, winnerPrinter);
            game.playGame(new Player("Вася"), new Player("Игорь"));

            if (Objects.equals (gamer.getName ( ), "Вася")) {
                throw new RuntimeException ("Game has no winner, results are equal");
            } else if (Objects.equals (gamer.getName ( ), "Игорь")) {
                throw new RuntimeException ("With equal results console output a winner");
            }
            System.out.print (scenario + " passed"+ "\n");
        }catch (Exception e){
            System.err.print (scenario + " failed  with message: " + e.getMessage () + "\n");
        }

    }

    public void playGameTestRightEqualFunction(){
        String scenario  = "Game.playGame test for right compare dice.roll ";

        try{
            Dice dice = new DiceImplTestImpl2 ( );
            GameWinnerPrinter winnerPrinter = new GameWinnerPrinterTestIpml();

            Game game = new Game(dice, winnerPrinter);
            game.playGame(new Player("Вася"), new Player("Игорь"));

            if (Objects.equals (gamer.getName ( ), "Вася")) {
                throw new RuntimeException ("Compare are not right");
            }
            System.out.print (scenario + "passed"+ "\n");
        }catch (Exception e){
            System.err.print (scenario + " failed  with message: " + e.getMessage ()+ "\n");
        }
    }
}
