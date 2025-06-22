class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            int count = (int) (Math.log10(num) + 1); 
            if (count % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }
}