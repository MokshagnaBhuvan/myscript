import java.util.Scanner;
import java.lang.Thread;
public class arrays {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] array = new int[4];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Here are the elements of the array ");
        for (int i = 0; i < array.length; i++){
        
        System.out.println(array[i]);
        Thread.sleep(1000);
        }
    }

}
