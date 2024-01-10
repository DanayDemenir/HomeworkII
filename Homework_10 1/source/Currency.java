package source;

public class Currency {
    private static final String valueMany = "рублей";

    private static final String valueStrange = "рубля";

    private static final String valueOne = "рубль";

    public static String getCurrency(int ones){

        if((ones==11)||(ones==12)||(ones==13)||(ones==14)) return valueMany;

        switch (ones%10){
            case 1: {return valueOne;}
            case 2, 3, 4: {return valueStrange;}
            default: return valueMany;
        }
    }
}
