/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        int peak = peakIndexInMountainArray(arr);
        int firstAttempt = orderAgnosticBinarySearch(arr, target, 0, peak);
        if (firstAttempt != -1) {
            return firstAttempt; // Found in the first half
        }

        int secondAttempt = orderAgnosticBinarySearch(arr, target, peak + 1, arr.length() - 1);
        return secondAttempt; // Found in the second half

    }

    public int orderAgnosticBinarySearch(MountainArray arr, int target, int start, int end) {
        boolean isAsc = arr.get(start) < arr.get(end);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int elem = arr.get(mid);
            if (elem == target) {
                return mid; 
            }
            if (isAsc) {
                if (elem < target) {
                    start = mid + 1; // Search in the right half
                } else {
                    end = mid - 1; // Search in the left half
                }
            } else {
                if (elem > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1; // Target not found
    }

    public int peakIndexInMountainArray(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) > arr.get(mid + 1)) {
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