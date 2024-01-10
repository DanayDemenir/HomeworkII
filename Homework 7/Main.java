public class Main {

    public static void main(String[] args) {
        SomeClass a = new SomeClass ();

        //a.increaseSomeValue ("Ошибка с выводом");
        //a.decreaseSomeValue ("rethrow");

        try(SomeClass b = new SomeClass ( "try-with-resources" )){
            b.implementSomeValue (1);
        }
        catch (Exception e) {
            // Грех
            //throw new RuntimeException ("Ошибочка вышла "+e.getMessage ());
        }
    }
}
