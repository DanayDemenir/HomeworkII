package test;

import source.Print;
import test.BuildFinalString.BuildFinalTest;
import test.Currency.*;
import test.NumberList.NumberListGiveStringTest;
import test.SplitInt.SplitIntTest;

public class AllTest {

    public static void main(String[] args) {
        try{
            GetCurrencyTest.getCurrencyTest();
            SplitIntTest.splitTest ();
            BuildFinalTest.testBuilderFinalString ();
            NumberListGiveStringTest.GiveStringTest ();
        } catch (Exception e){
            Print.printSmthg ("Test failed with message" + e.getMessage ( ) + "\n");
        }

    }
}
