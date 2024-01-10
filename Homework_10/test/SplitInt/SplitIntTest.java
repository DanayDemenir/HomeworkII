package test.SplitInt;

import source.Currency;
import source.Print;
import source.SplitInt;

import java.util.ArrayList;

public class SplitIntTest {

    private static void testSplit(int num, ArrayList list){
        SplitInt splitter = new SplitInt ();
        ArrayList tempList = new ArrayList<> ();
        tempList = splitter.splitInt (num);

        for(int i=0;i<list.size ();i++){
            if (!(tempList.get (i).equals (list.get (i)))){
                throw new RuntimeException ( "SplitInt at " + num );
            }
        }
    }

    public static void splitTest (){
        try {
            ArrayList list = new ArrayList (  );

            list.add (0);
            testSplit (0,list);
            list.add(1);
            testSplit (10,list);
            list.add (2);
            testSplit (210,list);
            list.add (4);
            testSplit (4210,list);

            Print.printSmthg ("getCurrency test passed\n");
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
