class Solution {
    public int maxArea(int[] height) {
        int s= 0;
        int e = height.length -1 ;
        int area =0;

        while(s<=e){
            int h = Math.min(height[s], height[e]);
            int l = e-s;

            int a  = l*h;
            area = (a > area) ? a : area;

            if(height[s]==height[e]){
                s++;
            }
            else if(height[s]<height[e]){
                s++;
            }
            else{
                e--;
            }

        }

        return area;
        
    }
}