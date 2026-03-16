import java.util.*;
class prime{
    public static void main(String args[]){
        int n = 9;
        int end =189;
        for (int i = n;i<=end; i++){
            int c=0;
            for (int j=1;j<=i;j++){
                if(i%j==0){
                    c++;
                }
            }
            if (c==2){
                System.out.println(i);
            }
        }
    }
}