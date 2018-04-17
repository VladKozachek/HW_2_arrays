import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
         int [] arr=new int[10];
         for (int i=0;i<arr.length;i++){
             arr[i]=random.nextInt(100);
         }

        WorkArrays workArrays = new WorkArrays(arr);
        workArrays.fillArray();
        workArrays.outputElementsReverse();
        workArrays.maxElement();
        workArrays.minElement();
        workArrays.sumOddElements();
    }
}
