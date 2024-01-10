import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {
        String[] arrayOfQuestions = {"1. Чему равно 1+1?", "2. Чему равно 1+2?", "3. Чему равно 1+3?"};
        int[] arrayOfAnswers = {1, 2, 3, 3, 2, 4, 3, 1, 4};
        int j = 0;
        Scanner console = new Scanner(System.in);

        for (int i = 0; i < arrayOfQuestions.length; i++) {
            System.out.println(arrayOfQuestions[i] + "\n");

            System.out.print("1)" + arrayOfAnswers[j] + "\t");
            System.out.print("2)" + arrayOfAnswers[j + 1] + "\t");
            System.out.println("3)" + arrayOfAnswers[j + 2] + "\t");
            j += 3;
            String answer = console.next();
            String temp = "";
            switch (i) {
                case 0:
                    if (answer.equals(temp.valueOf(2))) {
                        System.out.println("Верно!");
                    } else {
                        System.out.println("Неверно!");
                    }
                    break;

                case 1:
                    if (answer.equals(temp.valueOf(1))) {
                        System.out.println("Верно!");
                    } else {
                        System.out.println("Неверно!");
                    }
                    break;
                case 2:
                    if (answer.equals(temp.valueOf(3))) {
                        System.out.println("Верно!");
                    } else {
                        System.out.println("Неверно!");
                    }
                    break;

            }
        }
    }
}
