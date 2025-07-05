class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
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
				result.add(nums[i]);
			}
		}
		return result;
    }
}