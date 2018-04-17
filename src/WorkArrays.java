import java.util.Random;

public class WorkArrays {
    private int [] arr=new int[10];

    public WorkArrays(int[] arr) {
        this.arr = arr;
    }

    public void fillArray(){  // заполняем массив случайными числавми и выводим на экран
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
    public void outputElementsReverse(){  // выводи массив в обратном порядке
        for (int i=arr.length;i>0;i--){
            System.out.print(arr[i-1]);
            System.out.print(" ");
        }
        System.out.println();
    }
    public void maxElement(){  //Находим максимальный элемент
        int indexMax=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>arr[indexMax]){
                indexMax=i;
            }
        }
        System.out.println("Max element : "+arr[indexMax]+ " Index : "+ indexMax);
    }
    public void minElement(){  //Находим минимальный элемент
        int indexMin=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<arr[indexMin]){
                indexMin=i;
            }
        }
        System.out.println("Min element : "+arr[indexMin]+ " Index : "+ indexMin);
    }
    public void sumOddElements(){
        int count=0;
        int summ=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2 != 0){
                count++;
                summ=summ+arr[i];
            }
        }
        System.out.println("Количество нечетных элементов : "+count+" Сумма нечетных элементов : "+ summ );
    }

}
