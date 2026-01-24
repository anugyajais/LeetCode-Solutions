class Solution {
    public String minWindow(String s, String t) {
        int n = t.length();
        int e = s.length();
        int l=0;
        int r=0;
        int start=0;
        int minlen = Integer.MAX_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char c: t.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        int need=t.length();

        while(r<e){
            char ch = s.charAt(r);
            if(map.containsKey(ch)){
                if(map.get(ch)>0){
                    need--;
                }
                map.put(ch,map.get(ch)-1);

            }

            while(need==0){
                if(r-l+1 <minlen){
                    minlen = r-l+1;
                    start=l;
                }

                char lch=s.charAt(l);
                if(map.containsKey(lch)){
                    map.put(lch, map.get(lch)+1);
                    if(map.get(lch)>0){
                        need++;
                    }
                }
                l++;
            }
            r++;
        }

        if(minlen==Integer.MAX_VALUE){
            return "";
        }
        else return s.substring(start, start+minlen);
    }
}