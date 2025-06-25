class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       	int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1]) {
				//aka decreasing slope 
				//aka the peak is either the mid orr before the mid  
				end = mid;
			} else {
				// increasing slope part
				//hence search beyond the nex element
				start = mid + 1;
				// System.out.println("Start: " + start + ", End: " + end + ", Mid: " + mid);
			}
		}
		return start; // or end, both are the same at this point
	}
}