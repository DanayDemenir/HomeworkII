package test.BuildFinalString;

import source.BuildFinalString;
import source.Currency;
import source.Print;
import source.SplitInt;

import java.util.ArrayList;

public class BuildFinalTest {

    private static void exceptionThrower(ArrayList list, String expected, int numExpected){
        BuildFinalString builder = new BuildFinalString ();
        if (!(builder.buildFinalString (list).equals (expected))){
            throw new RuntimeException ( "BuildFinalString at " + numExpected);
        }
    }

    public static void testBuilderFinalString(){
        try {
            ArrayList list = new ArrayList (  );

            list.add (0);
            exceptionThrower (list,"ноль"+" ",0);

            list.add (1);
            exceptionThrower (list,"десять"+" ",10);

            list.add (2);
            exceptionThrower (list,"двести десять"+" ",210);

            list.add (4);
            exceptionThrower (list,"четыре тысячи двести десять"+" ",4210);

            Print.printSmthg ("BuildFinalString test passed\n");
        } catch (RuntimeException e) {
            throw new RuntimeException (e);
        }
    }
}
