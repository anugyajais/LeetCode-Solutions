class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        int n = isConnected.length;
        boolean v[] = new boolean[n];
        int c=0;
        for(int i=0; i<n; i++){
            if(!v[i]){
                dfs(isConnected , v, i);
                c++;
            }
        }
        return c;
    }
    private void dfs(int[][] isConnected , boolean v[], int i ){
        v[i] = true;
        for(int j=0; j<isConnected.length; j++){
            if( isConnected[i][j] == 1 && !v[j] )
                dfs(isConnected , v, j);
        }
    }
}