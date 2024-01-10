public class Printer {
    public void printIntArray(int[] incomeArray){
        int printCount;
        if (incomeArray.length>1000){
            printCount = 1000;
        }
        else {
            printCount = incomeArray.length;
        }

        for(int i=0;i<printCount-1;i++){
            System.out.print(incomeArray[i]+", ");
        }
        System.out.print(incomeArray[incomeArray.length-1]);
    }
}
