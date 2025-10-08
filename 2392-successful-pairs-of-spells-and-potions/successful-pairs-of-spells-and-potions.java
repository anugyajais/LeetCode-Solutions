class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        int n = spells.length;
        int m = potions.length;

        Arrays.sort(potions);
        int[] res = new int[n];
        for(int i=0; i<n ; i++){
            int l = 0;
            int r = m-1;
            int p=m;
            int sp = spells[i];    
            while( l<=r ){
                int mid = l+ (r-l)/2;
                long prod = (long)sp * potions[mid]; 

                if( prod>=success ){
                    r = mid-1;
                    p = mid; 
                }
                else{
                    l = mid+1;
                }
            }
            res[i] = m-p;
        }
        return res;
    }
}