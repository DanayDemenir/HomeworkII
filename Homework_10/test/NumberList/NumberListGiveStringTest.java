package test.NumberList;

import source.BuildFinalString;
import source.NumberList;
import source.Print;

import java.util.ArrayList;

public class NumberListGiveStringTest {
    private static void exceptionThrower(int dec, int num, String numExpected){

        if (!(NumberList.giveStringDec (dec,num)).equals (numExpected)){
            throw new RuntimeException ( "BuildFinalString at " + dec + ":" + num + " get " + NumberList.giveStringDec (dec,num) +
                    "but " + numExpected + " expected");
        }
    }

    public static void GiveStringTest(){
        try {
            exceptionThrower (0,0,"десять");

            exceptionThrower (1,0,"ноль");

            exceptionThrower (2,5,"пятьдесят");

            exceptionThrower (4,9,"девять тысяч");

            Print.printSmthg ("NumberList GiveStringDec test passed\n");
        } catch (RuntimeException e) {
            throw new RuntimeException (e);
        }
    }
}
