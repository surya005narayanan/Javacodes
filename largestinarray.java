import java.util.Scanner;

public class largestinarray {

    public static int findMax(int[] arr, int n) {
      int max = arr[0];
      for(int i =1;i<n;i++){
        if(arr[i]>max){
          max = arr[i];
          
        }
      }
      return max;
}

    // Main function below
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        while (t-- > 0) {
            int n = sc.nextInt();  
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(findMax(arr, n));
        }
        sc.close();
    }
}