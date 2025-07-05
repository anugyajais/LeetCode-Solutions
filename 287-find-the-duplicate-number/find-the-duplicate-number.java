class Solution {
 	public int findDuplicate(int[] arr) {
		int n = arr.length;
		int i = 0;
		while (i < n) {
			if (arr[i] != i + 1) {
				int correct = arr[i] - 1;
				if (arr[i] != arr[correct]) {
					swap(arr, i, correct);
				} else {
					return arr[i];
				}
			} else {
				i++;
			}
		}
		return -1;
	}
	
	public static void swap(int[] arr, int max, int target) {
		int t = arr[max];
		arr[max] = arr[target];
		arr[target] = t;
	}
}