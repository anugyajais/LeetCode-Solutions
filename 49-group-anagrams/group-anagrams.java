class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> ans = new HashMap<>();
        for(String s: strs){
            int key [] = new int [26];
            for(char c: s.toCharArray()){
                key[c-'a']++;
            }
            String k  = Arrays.toString(key);
            ans.putIfAbsent(k, new ArrayList<>());
            ans.get(k).add(s);
        }
        return new ArrayList<>(ans.values());
    }
}