class Solution {
    public int[] findErrorNums(int[] nums) {

        int n = nums.length;
        int i = 0;
        while (i < n) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                int t = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = t;
            } else {
                i++;
            }
        }
        for (i = 0; i < n; i++) {
            if (nums[i] != (i + 1)) {
                return new int[]{ nums[i], i+1}; 

            }
        }
        return new int[] {-1,-1};
    }
}