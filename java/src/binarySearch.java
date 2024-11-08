import java.util.*;
public class binarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
int[] array = {17,18,19,21,23,24};
int start,end,mid;
start = 0;
end=array.length-1;
System.out.println("Enter the value to search in array");
int key = sc.nextInt();
while(start<=end){
    mid = (start+end)/2;
    if(array[mid]==key){
        System.out.println("Value found at index "+mid);
        break;
    }
    else if(array[mid]>key){
        end = mid-1;
    }
    else if(array[mid]<key){
        start = mid+1;
    }
}

    }
    
    

}
