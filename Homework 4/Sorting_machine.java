class SortIntArray
{
    public int[] bubbleSort(int[] incomeArray){
        for(int i=0; i<incomeArray.length-1; i++){
            for(int j=0; j<incomeArray.length-1; j++){
                if (incomeArray[j]>incomeArray[j+1]){
                    swap(incomeArray,j,j+1);
                }
            }
        }

        return incomeArray;
    }

    private void swap(int[] incomeArray,int firstPosition, int secondPosition){
        int temp;
        temp=incomeArray[firstPosition];
        incomeArray[firstPosition]=incomeArray[secondPosition];
        incomeArray[secondPosition]=temp;
    }
}

public class Sorting_machine {
    public static void main (String[] args){
        RandomArray testArray = new RandomArray(100000);
        Printer print = new Printer();
        long startTime = System.nanoTime();
        System.out.println("\nМассив до сортировки:");
        print.printIntArray(testArray.getJustArray());
        SortIntArray machine = new SortIntArray();
        int[] temp = machine.bubbleSort (testArray.getJustArray ( ));
        System.out.println("\nМассив после сортировки:");
        print.printIntArray(temp);
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("\nВремя выполнения "+duration/1000000 + " микросекунд");
    }
}
