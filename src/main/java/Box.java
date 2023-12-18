import java.util.ArrayList;

public class Box<T extends Fruits> implements Boxes {
    private ArrayList<Fruits> insides = new ArrayList<> ( );

    public double weight() {
        double result = 0;
        for ( int i = 0; i < insides.size ( ); i++ ) {
            result += insides.get (i).mass;
        }
        return result;
    }

    public boolean compare(Boxes anotherBox) {
        return this.weight ( ) > anotherBox.weight ( );
    }

    public void emptyInto(Boxes anotherBox) {
        for ( int i = 0; i < insides.size ( ); i++ ) {
            anotherBox.putSmthIn (insides.get (i));
        }
        insides.clear ( );
    }

    public void putSmthIn(Fruits someFruit) {
        insides.add (someFruit);
    }


    public void boxView() {
        System.out.println (insides);
    }
}
