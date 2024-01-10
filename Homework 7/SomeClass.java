public class SomeClass implements AutoCloseable {
    private int someValue;
    public SomeClass()
    {
        someValue = 0;
    }

    public SomeClass(Object value){
        someValue = (int) value;
    }

    @Override
    public void close(){
    }

    public void increaseSomeValue(Object value)
    {
        try{
            DoSomething.increaseValue (someValue,value);
        }catch (Exception e){
            throw new RuntimeException (e.getMessage ());
        }

    }

    public void decreaseSomeValue(Object value)
    {
        try{
            DoSomething.decreaseValue (someValue,value);
        }catch (Exception e){
            throw new RuntimeException (e.getMessage ());
        }

    }

    public void implementSomeValue(Object value){
        DoSomething.implementValue (someValue,value);
    }
}

