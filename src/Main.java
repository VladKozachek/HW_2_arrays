
public class Main {
    public static void main(String[] args) {

         int [] arr=new int[20];
         for (int i=0;i<arr.length;i++){
             arr[i]=(int) (Math.random()*(100+1))-50; //случайные числа от -50 до 50
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
        workArrays.average();
    }
}
