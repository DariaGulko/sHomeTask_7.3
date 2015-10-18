/**
 * Created by Dariya on 18.10.2015.
 * Напишите программу, печатающую количество максимальных элементов непустого массива, в которой используется только один цикл.
 */
public class Main {
    public static void main(String[] args) {
        int array[] =new int[10];
        int sum=0;
        int max=array[0];
        for (int i = 0; i < array.length; i++){
                array[i]= (int) (Math.random() * 10);
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i <array.length ; i++) {
            if(array[i]>max){
                max=array[i];
                sum=1;
            } else if (max == array[i]) {
                sum++;
            }
        }
        System.out.println("\nSum="+sum);
    }
}
/*
for (int i = 0; i < array.length; i++){
        array[i]= (int) (Math.random() * 10);
        }
        for (int i = 0; i < array.length; i++){
        System.out.print(array[i] + " ");
        }
        for (int i = 0; i <array.length ; i++) {
        if(array[i]>max){
        max=array[i];
        }
        }
        for (int i = 0; i <array.length ; i++) {
        if (max == array[i]) {
        sum++;
        }
        }
        System.out.println("\nSum="+sum);
        }
*/
