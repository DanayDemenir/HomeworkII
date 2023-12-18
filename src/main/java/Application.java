public class Application {
    public static void main(String[] args) {
        Boxes<Apple> appleBox = new Box<Apple> ( );
        Boxes<Apple> secBox = new Box<Apple> ( );
        Boxes<Fruits> thirdBox = new Box<Fruit> ( );

        Apple apple = new Apple ( );
        Orange orange = new Orange ( );

        appleBox.putSmthIn (apple);
        appleBox.boxView ( );

        appleBox.emptyInto (secBox);
        appleBox.boxView ( );
        secBox.boxView ( );

        thirdBox.putSmthIn (apple);
        thirdBox.putSmthIn (orange);
        thirdBox.boxView ( );

        System.out.println (thirdBox.compare (secBox));
        System.out.println (thirdBox.weight ( ));
        System.out.println (appleBox.weight ( ));

        System.out.println (orange.mass);
    }
}
