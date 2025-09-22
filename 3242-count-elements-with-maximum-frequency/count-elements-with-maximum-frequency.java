class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        int n = nums.length;
        int sum =0; 
        int max  = 0;
        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int i: nums){
            
            hash.put( i , hash.getOrDefault(i,0) +1 );

        }
        for(Map.Entry<Integer,Integer> en: hash.entrySet()){
            if(en.getValue() > max){
                max =en.getValue();
            }
        }
        for(Map.Entry<Integer,Integer> en: hash.entrySet()){
            if(en.getValue() == max){
                sum+=max;
            }
        }

        return sum;

    }
}