class Solution {
public:
    int maxAscendingSum(vector<int>& nums) {
        int n=nums.size();
        int smax=nums[0];
        int s=nums[0];

        for(int i=1 ;i<n;i++)
        {
            if(nums[i-1]<nums[i])
            {
                s+=nums[i];
            }
            else
            {
                smax=max(smax,s);
                s=nums[i];
            }
        }
        smax=max(s,smax);
        return smax;
    }
};