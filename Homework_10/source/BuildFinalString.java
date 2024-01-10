package source;

import java.util.ArrayList;

public class BuildFinalString implements BuildNumberFromString {


    @Override
    public String buildFinalString(ArrayList decList) {

        if(decList.isEmpty () ) return "empty";
        if(decList.size ()>4) return "size";

        if (decList.size ()==1){
            return getOneToNine (decList)+" ";
        }

        if((decList.size ( ) == 2)&&(decList.get(1).equals(1))){
            return getTenToNineteen (decList)+" ";
        }


        return getTwentyToThousands (decList);
    }

    private String getTwentyToThousands (ArrayList decList){
        StringBuilder finalString = new StringBuilder ();
        int i=0;


        for(;i<decList.size();i++){
            if (decList.get(i).equals (0)){continue;}
            finalString.insert (0," ");
            finalString.insert (0,NumberList.giveStringDec (i+1, ( Integer ) decList.get (i)));

        }

        return finalString.toString ();
    }

    private String getOneToNine(ArrayList decList){
        return NumberList.giveStringDec (1, ( Integer ) decList.get (0));
    }

    private String getTenToNineteen(ArrayList decList){
        return NumberList.giveStringDec (0, ( Integer ) decList.get (0));
    }
}
