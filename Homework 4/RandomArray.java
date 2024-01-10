

public class RandomArray {
    private int justArray[];
    public RandomArray(int arrayLength){
        justArray = new int[arrayLength];
        for ( int i = 0; i < arrayLength - 1; i++ ) {
            justArray[ i ] = getRandom ();
        }
    }

    private static int getRandom(){
        return (int) (Math.random() * 1000);
    }

    public int[] getJustArray() {
        return justArray;
    }
}
