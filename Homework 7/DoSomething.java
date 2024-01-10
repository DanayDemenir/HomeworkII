import java.io.ObjectInputValidation;
import java.util.logging.Logger;

public class DoSomething {

    public static void increaseValue(Object var, Object value) throws Exception
    {
        var = ( int ) var + ( int ) value;
    }

    public static void decreaseValue (Object var, Object value){

        try{
            var = ( int ) var - ( int ) value;
        }catch (Exception e){
            System.out.println ( "That must be in logs, but Error in decreaseValue" );
            throw e;
        }

    }

    public static void implementValue (Object var, Object value){
        var = (int)var * (int)value;
    }
}
