import java.util.*;
class reverse{
    public static void main(String args[]){
        String str = "I am Iron man";
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
                    }
        System.out.println(rev);
    }
}


import java.util.*;
class reverse{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Surya");
        int l=0; 
        int r = sb.length()-1;
        while(l<r){
            char t = sb.CharAt(l);
            sb.setCharAt(l,sb.CharAt(r));
            sb.setCharAt(r,t);
            l++;
            r--;
        }
        return sb;
    }
}