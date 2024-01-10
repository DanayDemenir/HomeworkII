package source;

public class main {

    public static void main(String[] args) {
        SplitNumToDec splitter = new SplitInt ();
        BuildNumberFromString builder = new BuildFinalString ();

        int num = InputNum.inputNum ();

        Print.printSmthg (builder.buildFinalString (splitter.splitInt (num))+Currency.getCurrency (num));

    }
}
