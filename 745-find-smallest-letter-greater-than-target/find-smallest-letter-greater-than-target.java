class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ceil = ' ';
		int start = 0;
		int end = letters.length - 1;
		int mid = 0;
        if(target >= letters[end] || target< letters[0]) return letters[0];
		while (start<=end) {
			mid = start + (end - start) / 2;
			if (letters[mid] > target) {
				end = mid - 1;
				ceil = letters[mid];
			} else {
				start = mid + 1;
			}
		}
        return ceil;
    }
}