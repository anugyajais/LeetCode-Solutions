class Solution {
    public int search(int[] nums, int target) {
     	int start = 0;
		int end = nums.length - 1;
		int pivot = findPivotInRotatedSortedArray(nums);
		if (pivot == -1) {
			// Array is not rotated, perform normal binary search
			return orderAgnosticBinarySearch(nums, target, start, end);
		}
		// If target is greater than or equal to the first element, search in the left part
		if (target >= nums[start]) {
			return orderAgnosticBinarySearch(nums, target, start, pivot);
		}
		// Otherwise, search in the right part
		if (target <= nums[end]) {
			return orderAgnosticBinarySearch(nums, target, pivot + 1, end);
		}
		return -1;
	}
	
	public int findPivotInRotatedSortedArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while(start<=end) {
			int mid = start + (end - start) / 2;
			if(mid<end && arr[mid]>arr[mid+1]){
				return mid;
			}
			if(mid>start && arr[mid]<arr[mid-1]){
				return mid-1;
			}
			if(arr[mid]<=arr[start]){
				end = mid-1;
			}
			else{
				start = mid + 1;
			}
		}
		return -1; // Pivot not found, array is not rotated
	}
    	public int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
		boolean isAsc = arr[start] < arr[end];
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid; // Target found
			}
			if (isAsc) {
				if (arr[mid] < target) {
					start = mid + 1; // Search in the right half
				} else {
					end = mid - 1; // Search in the left half
				}
			} else {
				if (arr[mid] > target) {
					start = mid + 1; // Search in the right half
				} else {
					end = mid - 1; // Search in the left half
				}
			}
		}
		return -1; // Target not found
	}
}
