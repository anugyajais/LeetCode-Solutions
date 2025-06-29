class Solution {
    	public int splitArray(int[] nums, int k) {
		int start = 0;
		int end = 0;
		for (int num : nums) {
			start = Math.max(start, num);
			end += num;
		}
		while (start < end) {
			int mid = start + (end - start) / 2;
			
			int sum = 0;
			int pieces = 1; // 1 piece = whole array = max possible sum
			for (int num : nums) {
				if (sum + num > mid) {
					sum = num; // Start new piece with current number
					pieces++;
				} else {
					sum += num; // Add to current piece
				}		
			}
			if (pieces > k) {
				start = mid + 1; // Increase the minimum possible sum
			}
			else {
				end = mid; // Try to find a smaller maximum sum
			}
		}
		return end;
	}	
}