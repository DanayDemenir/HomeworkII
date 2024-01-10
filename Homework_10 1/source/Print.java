package source;

import java.util.ArrayList;

public class Print {

    public static void printSmthg(String string){
        System.out.print (string);
    }

    static void printArrayList(ArrayList array){
        for (int i=0;i<array.size ();i++){
            System.out.print(array.get(i)+" ");
        }
    }
}
