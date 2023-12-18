import java.util.ArrayList;

public interface Boxes<T extends Fruits> {
    ArrayList<Fruits> insides = new ArrayList<> ( );

    public double weight();

    public boolean compare(Boxes anotherBox);

    public void emptyInto(Boxes<T> anotherBox);

    public void putSmthIn(T someFruit);

    public void boxView();
}