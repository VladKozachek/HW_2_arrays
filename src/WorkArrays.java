
public class WorkArrays {
    private int [] arr=new int[10];

    public WorkArrays(int[] arr) {
        this.arr = arr;
    }

    public void fillArray(){  // заполняем массив случайными числавми и выводим на экран
        System.out.print("Вывод массива : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
    public void outputElementsReverse(){  // выводи массив в обратном порядке
        System.out.print("Вывод массива в обратном порядке : ");
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
    public void sumEventElements(){ //Сумма и колитчество четных элементов
        int count=0;
        int summ=0;
        for (int item:arr){
            if(item%2 == 0){
                count++;
                summ=summ+item;
            }
        }
        System.out.println("Количество четных элементов : "+count+" Сумма четных элементов : "+ summ );
    }
    public void sumRangeEventElements(){ //Сумма и колитчество четных элементов в диапазоне от 20 до 30
        int count=0;
        int summ=0;
        for (int item:arr){
            if(item>=20&&item<=30&&item%2 == 0){
                count++;
                summ=summ+item;
            }
        }
        System.out.println("Количество четных элементов в диапазоне от 20 до 30 : "+count+" Сумма четных элементов : "+ summ );
    }

    public void maxEventElements(){ //Максимальный из четных элементов
        int indexMax=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                if(arr[i]>arr[indexMax]){
                    indexMax=i;
                }
            }
        }
        System.out.println("Максимальный из четных элементов : "+arr[indexMax]);
    }
    public void minEventElements() { //Минимальный из четных элементов
        int indexMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                if (arr[i] < arr[indexMin]) {
                    indexMin = i;
                }
            }
        }
        System.out.println("Минимальный из четных элементов : " + arr[indexMin]);
    }
    public void signReplacement(){  //Изменение отрицательного знака на положительный
        System.out.print("Замена - на + :");
        for (int item :arr){
            if(item<0){
                item=Math.abs(item);
            }
            System.out.print(item);
            System.out.print(" ");
        }
        System.out.println();
    }
    public void incrementAndDecrement (){  //инкрементирование положительного числа и декрементирование отрицательного
        System.out.print("Инкрементирование положительного числа и декрементирование отрицательного :");
        for(int item:arr){
            if(item>0){
                item++;
            }
            else if(item<0){
                item--;
            }
            System.out.print(item);
            System.out.print(" ");
        }
        System.out.println();
    }
    public void average(){  //Cреднее арифметическое массива и количество элементов больших среднего арифметического
        int temp=0;
        int count=0;
        int average=0;
        for(int item:arr){
            temp=temp+item;
        }
        average=temp/arr.length;
        for (int item:arr){
            if(item>average){
                count++;
            }
        }
        System.out.println("Cреднее арифметическое "+average+" количество элементов больших среднего арифметического : "+count);

    }
}
