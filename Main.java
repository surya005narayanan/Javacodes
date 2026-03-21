import java.util.*;

public class Main {

    public static boolean isArmstrong(int n) {
        int original = n;

        // Step 1: count digits
        int digits = 0;
        int temp = n;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // Step 2: calculate sum
        int sum = 0;
        temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isArmstrong(n)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}