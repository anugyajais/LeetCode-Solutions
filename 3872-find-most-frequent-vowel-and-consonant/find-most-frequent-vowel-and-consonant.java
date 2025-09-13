class Solution {
    public int maxFreqSum(String s) {

        Map<Character,Integer> c= new HashMap<>();
        Map<Character,Integer> v= new HashMap<>();

        String vowels = "aeiou";

        for(char ch:s.toCharArray()){
            if(vowels.indexOf(ch) == -1){
                c.put(ch , c.getOrDefault(ch,0)+1);
            }
            else{
                v.put(ch , v.getOrDefault(ch,0)+1);

            }
        }
        int maxx=-1;
        int ans=0;
        for(Map.Entry<Character,Integer> entry : v.entrySet()){
            if(entry.getValue()>maxx){
                maxx = entry.getValue();
            }
        }
        if(maxx==-1)maxx=0;
        ans=maxx;
        
        maxx=-1;
        for(Map.Entry<Character,Integer> entry : c.entrySet()){
            if(entry.getValue()>maxx){
                maxx = entry.getValue();
            }
        }
        if(maxx==-1)maxx=0;

        return ans+maxx;

    }
}