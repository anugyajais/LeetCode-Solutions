class Solution {
    public int firstMissingPositive(int[] nums) {
          
		// List<Integer> result = new ArrayList<>();
        int n = nums.length;

		int i = 0;
		while (i < n) {
			int correctIndex = nums[i]-1;
			if(nums[i]<n && nums[i]>0 && nums[i] != nums[correctIndex]) {
				int t = nums[i];
				nums[i] = nums[correctIndex];
				nums[correctIndex] = t;
			} else {
				i++;
			}
		}
        System.out.println(Arrays.toString(nums));
		for (i = 0; i < n; i++) {
			if ( nums[i] != (i + 1)) {
                return i+1;
			}
		}
		return n+1;
	}
}