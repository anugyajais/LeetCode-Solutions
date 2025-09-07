class Solution {
    public int[] sumZero(int n) {
        int res[] = new int[n];
        // if(n==0) return res;
        int j =0;
        for(int i=1; i<=n/2; i++){
        //    if(n%2!=0)res[n/2] = 0;
        //    if(i%2==0){
            res[j++] = -i;
        //    }
        //    else{
            res[j++] = i;
        //    }

           }
        return res;
    }
}