import java.util.Scanner;

public class powerof2 {
    public static boolean isPowerOfTwo(int n) {
      if (n == 1) return true;
    if (n == 0 || n % 2 != 0) return false;

    return isPowerOfTwo(n / 2);
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (isPowerOfTwo(n)) System.out.println("Yes");
            else System.out.println("No");
        }
        sc.close();
    }
}