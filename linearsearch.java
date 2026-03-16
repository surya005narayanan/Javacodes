import java.util.*;
class linearsearch{
    public static void main(String args[]){
        int[] arr={1,2,3,4,5,6,7,8,9};
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int n = arr.length;
        boolean found = false;
        for(int i = 0;i<n;i++){
            if(arr[i]==x){
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println(-1);
        }
    }
}