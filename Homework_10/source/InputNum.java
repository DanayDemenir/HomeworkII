package source;
import java.util.Scanner;

public class InputNum {

    public static int inputNum(){
        Scanner sc = new Scanner(System.in);
        Print.printSmthg ("Введите число от 0 до 9999:");
        int number = sc.nextInt();
        return number;
    }
}
