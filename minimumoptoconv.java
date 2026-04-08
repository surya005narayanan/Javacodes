import java.util.*;
class minimumoptoconv{
    public int minDistance(String word1, String word2){
        int n = word1.length();
        int m = word2.length();
        int[][] costDP = new int[m+1][n+1];
        for(int i=1;i<=m;i++) costDP[i][0]=i;
        for(int j=1;j<=n;j++) costDp[0][j]=j;
        for(int i =1;i<=m;i++)
        for(int j=1;j<=n;j++)
            if(word1.charAt(i-1)== word2.charAt(j-1))
            costDP[i][j] = costDP[i-1][j-1];
        }
    }
}
