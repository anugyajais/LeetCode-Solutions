class Solution {
public:
    int can(vector<int>&q , int n, int m)
    {
        int s =0;
        for(int qq:q)
            s+=(qq + m -1) /m;       
        return s<=n; 
    }
    int minimizedMaximum(int n, vector<int>& quantities)
    {
        int  l =1; 
        int r= *max_element(quantities.begin(),quantities.end());
        while(l<=r)
        {
            int m= (l+r)/2;
            if(can(quantities, n ,m))
            {
                r=m-1;   
            }
            else
            {
                l=m+1;
            }
        }
        return l;
    }
};