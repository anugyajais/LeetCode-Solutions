class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> sett = new HashSet<>();
        HashSet<Integer> rs = new HashSet<>();

        // List<Integer> a = new ArrayList<>();
        // int arr[] = new int[];
        for (int i : nums1) {
            sett.add(i);
        }
        for (int i : nums2) {
            if (sett.contains(i)) {
                rs.add(i);
            }
        }
        return rs.stream().mapToInt(Integer::intValue).toArray();
        // int[] ans = a.stream()mapToInt(Integer::intValue).toArray();
        // return a.toArray();
    }
}