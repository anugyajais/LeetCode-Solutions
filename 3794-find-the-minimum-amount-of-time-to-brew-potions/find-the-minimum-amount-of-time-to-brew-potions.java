class Solution {
    public long minTime(int[] skill, int[] mana) {
        int n = skill.length;
        int m = mana.length;
        long f[] = new long[n+1];
        for( int j=0; j<m; j++ ){
            for( int i=0; i<n; i++ ){
                f[i+1] =Math.max( f[i+1], f[i]) + (long)mana[j]*skill[i] ; 
            }
            for(int i = n-1; i>0; --i ){
                f[i] = f[i+1] - mana[j] * skill[i];
            }
        }
        return f[n];
        
    }
}