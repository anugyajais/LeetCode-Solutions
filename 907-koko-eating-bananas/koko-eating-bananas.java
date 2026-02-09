class Solution {
    public static int minEatingSpeed(int[] piles, int h) {
        int hrs = 0;

        // int maxpile = Collections.max(Arrays.asList(piles));
        int max = Arrays.stream(piles).max().getAsInt();
        int mid = 0;
        int l = 1;
        int r = max;
        while (l < r) {
            mid = l + (r - l) / 2;
            int currhr = 0;
            for (int p : piles) {
                currhr += (Math.ceil((double)p / mid));
            }
            if (currhr <= h) {
                r = mid;
            } else {
                l = mid + 1;
            }

        }
        return l;
    }
}