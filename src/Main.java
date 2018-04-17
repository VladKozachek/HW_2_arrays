import java.util.Random;

public class Main {
    public static void main(String[] args) {

         int [] arr=new int[20];
         for (int i=0;i<arr.length;i++){
             arr[i]=(int) (Math.random()*(200+1))-100;
         }

        WorkArrays workArrays = new WorkArrays(arr);
        workArrays.fillArray();
        workArrays.outputElementsReverse();
        workArrays.maxElement();
        workArrays.minElement();
        workArrays.sumEventElements();
        workArrays.sumRangeEventElements();
        workArrays.maxEventElements();
        workArrays.minEventElements();
        workArrays.signReplacement();
        workArrays.incrementAndDecrement();
    }
}
