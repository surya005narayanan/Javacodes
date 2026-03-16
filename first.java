import java.util.*;
class first{
    public static void main(String args[]){
        int a = 1275;
        int n = 9;
        int sum = a;
        while (sum>n){
            int temp = sum;
            sum = 0;
            while(temp !=0){
                sum = sum +temp  % 10;
                temp = temp / 10;
            }
        }
        System.out.println("Result:" + sum);
    }
}