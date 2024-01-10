package source;

import java.util.ArrayList;

public class SplitInt implements SplitNumToDec{
    private ArrayList splitNumber = new ArrayList ();

    @Override
    public ArrayList splitInt(int inputNum) {
        if(inputNum == 0){
            splitNumber.add (0);
            return splitNumber;
        }
        for(int i=inputNum;i>0;i/=10){
            splitNumber.add (i%10);
        }
        return splitNumber;
    }
}
