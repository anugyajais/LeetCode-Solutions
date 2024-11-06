class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        int l =1;
        int r = *max_element(piles.begin(),piles.end());
        while(l<r)
        {
            int k =l+(r-l)/2;
            if(can(piles , h , k))
            {
                r= k;
            }
            else
            {
                l=k+1;
            }
        }
        return l;
    }
    bool can(vector<int>piles, int h ,int k)
    {
        int hrs=0;
        for(int p :piles)
        {
            hrs+=ceil(double(p)/k);
        }
        return hrs <= h;
    }
};