import java.util.*;
class charnextnum{
 -+
    public static void main(String args[]){
        String s = "a3b2c4";
        String res="";
        for(int i=0;i<s.length()-1;i++){
            char ch = s.charAt(i);
            if(ch >='a' && ch<='z' || ch>='A' && ch<='Z'){
                int num = s.charAt(i+1) - '0';
                for (int j = 0;j<num;j++){
                    res = res + ch;
                }
            }
        }
        System.out.println(res);
    }
}
+

+--+

+--+
+