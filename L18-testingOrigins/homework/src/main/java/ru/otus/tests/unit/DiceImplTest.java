package ru.otus.tests.unit;
import ru.otus.game.DiceImpl;
public class DiceImplTest {
    public void rollTestForRange(){
        DiceImpl dices = new DiceImpl ();
        String scenario = "DiceImpl.Roll() test for being in range 1-6";
        try {
            int expectation = dices.roll();
            if (!((expectation > 0)&&(expectation < 7))){
                throw new RuntimeException("Roll result is out of range 1-6");
            }
            System.out.print (scenario + " passed"+ "\n");
        }catch (Exception e){
            System.err.print (scenario + " failed  with message: " + e.getMessage ()+ "\n");
        }
    }

    public void rollTestIsRealRandom(){
        DiceImpl dices = new DiceImpl ();
        String  scenario = "DiceImpl.Roll() test for giving a different value each time";

        try{
            int firstRoll = dices.roll ();
            int secondRoll = dices.roll ();

            if (firstRoll==secondRoll){
                throw new RuntimeException ( "Dice.roll random gives equal value" );
            }
            System.out.print (scenario + " passed"+ "\n");
        }catch (Exception e){
            System.err.print (scenario + " failed  with message: " + e.getMessage ()+ "\n");
        }
    }
}
