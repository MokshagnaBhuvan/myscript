import java.util.*;
public class BubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter the elements into the array");
        for(int i =0;i<array.length;i++){
            System.out.println("Enter Element "+(i+1));
            array[i] = sc.nextInt();
        }
        for(int k = 0; k < array.length - 1; k++){
            for(int j = 0; j < array.length - k - 1; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for(int i =0;i<array.length;i++){
            System.out.println("Sorted elements in array is "+array[i]);
            
        }
    }
}
