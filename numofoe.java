import java.util.*;
class numofoe{
    public static void main(String args[]){
        int n = 1486;
        int odd = 0;
        int even = 0;
        while (n!=0){
            int num = n%10;
            if(num%2==0){
                even = even +1;
            }
            else{
                odd= odd+1;
            }
            n=n/10;
        }
        System.out.println(odd);
        System.out.println(even);
    }
}