class Solution {
    //String, String
    public int minDistance(String s1, String s2) {
        //minDistanceHelperDP
        return minDistanceFunction(s1, s2, s1.length(), s2.length());
    }
    //String, String, int, int
    private int minDistanceFunction(String s1, String s2, int m, int n) {
        //set to create new int
        int[][] dp = new int[m+1][n+1];
        //for condition (int <=i nt)
        for (int i=0;i<=m;i++) {
            //for condition (int <= int)
            for (int j=0;j<=n;j++) {
                //if condition (int == 0)
                if (i == 0) {
                    //int[int][int]=int
                    dp[i][j] = j;
                }
                //else if (int == 0)
                else if (j == 0) {
                    //int[int][int]=int
                    dp[i][j] = i;
                }
                // else if (String .charAt(int-1) == String.charAt(int-1))
                else if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    //int[int][int]=int[int-1][int-1]
                    dp[i][j] = dp[i-1][j-1];
                }
                //else
                else {
                    //else condition int[int][int] + min.(int[int-1][int-1], .min(int[int][int-1],int[int-1][int]))
                    dp[i][j] = 1 + Math.min(dp[i-1][j-1], Math.min(dp[i][j-1], dp[i-1][j]));
                }
            }
        }
        //return int[int][int]
        return dp[m][n];
    }
}