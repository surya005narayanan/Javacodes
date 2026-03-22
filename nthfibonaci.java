import java.util.Scanner;

public class nthfibonaci {
    public static int fibonacci(int n) {
      if (n == 0) return 0;
    if (n == 1) return 1;

    int a = 0, b = 1;

    for (int i = 2; i <= n; i++) {
        int c = a + b;
        a = b;
        b = c;
    }

    return b;
   
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(fibonacci(n));
        }
        sc.close();
    }76
}