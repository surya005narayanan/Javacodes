import java.util.*;
class spiralmatrix{
    public static void main(String args[]){
        int arr[][]={
            {1,5,7},
            {6,8,9},
            {2,3,4},
        };

        int n=arr.length;
        int m=arr[0].length;
        int leftc=0;
        int rightc=m-1;
        int toprow=0;
        int btmrow=n-1;
        int tne=m*n;
        int count=1;
        while(count<=tne){
            for(int j=leftc,i=toprow;i<btmrow && count<=tne;i++){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            leftc++;
            for(int i=btmrow,j=leftc;j<=rightc && count<=tne;j++){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            btmrow--;
            for(int i=btmrow,j=rightc;i>=toprow && count<=tne;i--){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            rightc++;
            for(int i=)
        }
    }
}