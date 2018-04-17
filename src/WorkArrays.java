import java.util.Random;

public class WorkArrays {
    private int [] arr=new int[10];

    public void fillArray(){  // заполняем массив случайными числавми и выводим на экран
        for (int i=0;i<arr.length;i++){
            Random random=new Random();
            System.out.print(arr[i]=random.nextInt(100));
            System.out.print(" ");
        }
        System.out.println();
    }
    public void outputElementsReverse(){  // выводи массив в обратном порядке
        for (int i=arr.length;i>0;i--){
            System.out.print(arr[i-1]);
            System.out.print(" ");
        }
    }
}
