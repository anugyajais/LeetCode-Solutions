class Solution {
    public int[] getSneakyNumbers(int[] arr) {
    	// used when numbers given from 1-N
		// max comparisons- (2N-1) 
		// TC -> O(N) 
		
		// i		0 1 2 3 4
		// e		3 2 4 5 1
		ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
		int i = 0;
		while (i<n) {
			int correct = arr[i] ;
			if (arr[i] != arr[correct]) {
				// swap(arr, i, correct);
                int t  = arr[i];
                arr[i] = arr[correct];
                arr[correct] = t;
			}
			else {
				i++;
			}
		}
        for(i=0; i<n;i++){
            if(arr[i]!=i){
                ans.add(arr[i]);
            }
        }
    return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}