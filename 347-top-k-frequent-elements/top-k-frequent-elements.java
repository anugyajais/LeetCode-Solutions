class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i <= nums.length; i++) {
            freq[i] = new ArrayList<>();
        }
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> en : map.entrySet()) {
            freq[en.getValue()].add(en.getKey());
        }
        int res[] = new int[k];
        int idx=0;
        for (int i = freq.length - 1; i > 0; i--) {
            for (int j : freq[i]) {
                res[idx++] = j;
                if (idx == k) {
                    return res;
                }
            }
        }
        return res;

    }
}