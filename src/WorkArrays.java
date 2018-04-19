
public class WorkArrays {
    private int [] arr;
    private int [] arr2;


    public WorkArrays(int[] arr) {
        this.arr = arr;
    }
    public WorkArrays(int []arr,int [] arr2){
        this.arr=arr;
        this.arr2=arr2;
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
    public void pairSumElements(){   //Cозается третий массив , как попарная сумма двух массивов
        int [] arr3 = new int[arr.length];
        System.out.print("arr1 : ");
        for (int item:arr){   //вывод массива 1
            System.out.print(item);
            System.out.print(" ");
        }
        System.out.println();
        System.out.print("arr2 : ");
        for (int item:arr2){     //вывод массива 2
            System.out.print(item);
            System.out.print(" ");
        }
        System.out.println();
        System.out.print("arr3 : ");
       for (int i=0;i<arr.length;i++){    //сумируется сумма элементов 1 и 2 и записывпется в массив 3
           arr3[i]=arr[i]+arr2[i];
           System.out.print(arr3[i]);
           System.out.print(" ");
       }
        System.out.println();
    }


    public void concatenatingArrays(){   //Cозается третий массив , как конкатенация двух массивов
        int [] arr3 = new int[arr.length+arr2.length];
        System.out.print("arr1 : ");
        for (int item:arr){   //вывод массива 1
            System.out.print(item);
            System.out.print(" ");
        }
        System.out.println();
        System.out.print("arr2 : ");
        for (int item:arr2){     //вывод массива 2
            System.out.print(item);
            System.out.print(" ");
        }
        System.out.println();
        System.out.print("arr3 : ");

        for (int i=0;i<arr.length;i++){    //конкатенация первого массивов в массив 3
            arr3[i]=arr[i];
            System.out.print(arr3[i]);
            System.out.print(" ");
        }
        for (int i=0;i<arr2.length;i++){    //конкатенация второго массивов в массив 3
            arr3[i]=arr2[i];
            System.out.print(arr3[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public void replacMaxByMin(){  //меняем минимум и максимум местами
        int indexMax=0;
        int indexMin=0;
        for (int item:arr){
            System.out.print(item);
            System.out.print(" ");
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]<arr[indexMin]){
                indexMin=i;
            }
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]>arr[indexMax]){
                indexMax=i;
            }
        }
        System.out.println();
        System.out.println("Min element : "+arr[indexMin]);
        System.out.println("Max element : "+arr[indexMax]);
        int temp=arr[indexMin];
        arr[indexMin]=arr[indexMax];
        arr[indexMax]=temp;
        for (int item:arr){
            System.out.print(item);
            System.out.print(" ");
        }
    }

    public void deleteMaxAndMin() {  //убираем максимум и минимум
        int indexMax = 0;
        int indexMin = 0;
        for (int item : arr) {
            System.out.print(item);
            System.out.print(" ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[indexMin]) {
                indexMin = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[indexMax]) {
                indexMax = i;
            }
        }
        System.out.println();
        System.out.println("Min element : " + arr[indexMin]);
        System.out.println("Max element : " + arr[indexMax]);


        int count=arr.length;
        int[] tempsArr = new int[indexMax];
        for (int i=0;i<count-1;i++) {

            if(arr[i]==arr[indexMax]){
                tempsArr[i]=0;
            }
            else{
                tempsArr[i]=arr[i];
            }

           System.out.print(tempsArr[i]);
            System.out.print(" ");
        }


    }


}
