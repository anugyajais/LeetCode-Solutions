class Solution {
    public int longestSubarray(int[] nums) {
        int c=0;
        int start =0;
        int end=0;
        int n = nums.length;
        int ans =0;

        for( end=0 ; end<n ; end++ ){
            if(nums[end]== 0){
                c++;
            }
            while( c>1 ){
                if(nums[start]==0){
                    c--;
                }
                start++;
            }
            ans = Math.max(ans , end- start);
        }
        return ans;
    }
}