class Solution {
public:
    vector<int> resultsArray(vector<int>& nums, int k) {
        int cc=1;
        int n = nums.size();
        if(k==1)
            return nums;
        vector<int> v(n-k+1 , -1);
        for(int i=0 ; i < n-1 ; i++)
        {   
            if(nums[i+1]== nums[i] +1 )
            {
                cc += 1;
            }
            else
            {
                cc=1;
            }
            if( cc >= k )
            {
                v[ i-k + 2 ] = nums[i + 1];
            }
        }
        return v;
    }
};