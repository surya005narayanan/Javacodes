import java.util.*;
class oddevein{
    public static void main(String args[]){
        int[] arr = {4,6,7,9,2,5,0};
        System.out.println("Even numbers in reverse order:");
        for(int i=arr.length-1;i>=0;i--){
            if (i%2==0){
                System.out.println(arr[i]);
            }
        }
        System.out.println("Odd numbers in reverse order:");
        for(int i=arr.length-1;i>=0;i--){
            if(i%2!=0){
                System.out.println(arr[i]);
            }
        }

    }
}