import java.util.Scanner;

class Testing {
    private final String[][] arrayForTest = {{"1. Чему равно 1+1?", "2. Чему равно 1+2?", "3. Чему равно 1+3?"},
            {"1) 1", "2) 2", "3) 3"}, {"1) 3", "2) 2", "3) 4"}, {"1) 3", "2) 1", "3) 4"}};
    private final String[] arrayRightAnswers = {"2", "1", "3"};

    private int RightAnswers = 0;
    public void AskQuestion(int numberQuestion, PrintSomething printer) {
        Scanner console = new Scanner(System.in);
        printer.printQuestion(numberQuestion,arrayForTest);
        String answer = console.next();
        if (IsRight(answer, numberQuestion)) {
            printer.printString("You're Right!");
            RightAnswers++;
        } else {
            printer.printString("You're Wrong!");
        }
    }

    public int getLenght()
    {
        return arrayRightAnswers.length;
    }
    public int getRightAnswers() {
        return RightAnswers;
    }

    private boolean IsRight(String answer, int question) {
        return answer.equals(arrayRightAnswers[question]);
    }
}

class PrintSomething {
    public void printQuestion(int i, String[][] arrayForTest) {
        System.out.println(arrayForTest[0][i]);
        for (int j = 0; j < 3; j++) {
            System.out.print(arrayForTest[i + 1][j] + "\t");
        }
        System.out.println();
    }

    public void printRightAnswers(int rightAnswers, int amountOfQuestion)
    {
        System.out.println("Количество верных ответов: " + rightAnswers);
        System.out.println("Количество неверных ответов: " + (amountOfQuestion-rightAnswers));
    }
    public void printString (String text)
    {
        System.out.println(text);
    }
}

public class TestingOOP {

    public static void main(String[] args) {
        Testing obj = new Testing();
        PrintSomething printer = new PrintSomething();

        obj.AskQuestion(0,printer);
        obj.AskQuestion(1,printer);
        obj.AskQuestion(2,printer);

        printer.printRightAnswers(obj.getRightAnswers(), obj.getLenght());
    }
}
