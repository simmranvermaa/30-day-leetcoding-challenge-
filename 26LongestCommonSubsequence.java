class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] arr1=text1.toCharArray();
        char[] arr2=text2.toCharArray();
        int m=arr1.length;
        int n=arr2.length;
        int[][] lcs=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0){
                    lcs[i][j]=0;
                }
                else if(arr1[i-1]==arr2[j-1]){
                    lcs[i][j]=lcs[i-1][j-1]+1;
                }
                else{
                    lcs[i][j]=Math.max(lcs[i-1][j],lcs[i][j-1]);
                }
            }
        }
        return lcs[m][n];
    }
}
