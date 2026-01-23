class Solution {
    public boolean canJump(int[] nums) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        boolean []v= new boolean[nums.length];
        Arrays.fill(v,false);
        v[0]=true;
        while(!q.isEmpty()){
            int i = q.poll();

            if(i==nums.length-1) return true;
                
            for(int id=1 ; id<=nums[i];id++){
                if( (i+id)<nums.length&& (!v[i+id]))  {
                q.add(i+id);
                v[i+id] =true;
                }             
            }
            
        
        }
        return false;          

    }
}