import java.util.Objects;
import java.util.Random;

public class Client {
    private String name;
    private int age;

    public Client() {
        Random random = new Random ( );
        name = generateString (random, "ABCDEFGHIJKLMNOPQRSTUVWXYZ", 4);
    }

    public String getName() {
        return name;
    }

    public static String generateString(Random rng, String characters, int length) {
        char[] text = new char[ length ];
        for ( int i = 0; i < length; i++ ) {
            text[ i ] = characters.charAt (rng.nextInt (characters.length ( )));
        }
        return new String (text);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass ( ) != o.getClass ( )) return false;
        Client client = ( Client ) o;
        return name.equals (client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash (name);
    }
}
