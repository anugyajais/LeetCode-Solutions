class Solution {
       	static boolean binarySearch1d(int[][] matrix, int target, int r, int c1, int c2) {
		while (c1 <= c2) {
			int mid = c1 + (c2 - c1) / 2;
			if (matrix[r][mid] == target) {
				return true;
			} else if (matrix[r][mid] < target) {
				c1 = mid + 1;
			} else {
				c2 = mid - 1;
			}
		}
		return false ;// Not found
	}	
	
	public boolean searchMatrix(int[][] matrix, int target) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		if (cols == 0) {
			return false;
		}
		if (rows == 1) {
			return binarySearch1d(matrix, target, 0, 0, cols-1);
		}
		int r1 = 0;
		int r2 = rows - 1;
		int cmid = cols / 2;
		while ( r1 < ( r2 - 1 )) {
			int mid = r1 + (r2 - r1) / 2;
			if (matrix[mid][cmid] == target) {
				return true;
			}
			if (matrix[mid][cmid] < target) {
				r1 = mid;
			} else {
				r2 = mid;
			}
		}
		if (matrix[r1][cmid] == target) {
			return true;
		}
		if (matrix[r1 + 1][cmid] == target) {
			return true;
		}
        // check 4 halves
		if (target <= matrix[r1][cmid ] ) {
			return binarySearch1d(matrix, target, r1, 0, cmid - 1);
		}

		if (target >= matrix[r1][cmid]  && target <= matrix[r1 ][cols-1] ) {
			return binarySearch1d(matrix, target, r1, cmid + 1, cols - 1);
		}
		if (target <= matrix[r1 + 1][cmid] ) {
			return binarySearch1d(matrix, target, r1+1, 0, cmid - 1);
		}
		else {
			return binarySearch1d(matrix, target, r1 + 1, cmid+1, cols-1);	
		}
	  
    }
}