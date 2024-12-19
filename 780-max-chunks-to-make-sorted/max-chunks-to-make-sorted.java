class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int maxx = -1, count = 0;
        for (int i = 0; i < n; i++) {
            maxx = Math.max(maxx, arr[i]);
            if (maxx == i) {
                count++;
            }
        }
        return count;
    }
}