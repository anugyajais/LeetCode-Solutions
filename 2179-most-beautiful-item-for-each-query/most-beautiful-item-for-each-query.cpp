class Solution {
public:
    vector<int> maximumBeauty(vector<vector<int>>& items, vector<int>& queries) {
        
        vector<int> v;
        vector<int> m(items.size());
        sort(items.begin(), items.end());
        m[0]=items[0][1];
        for(int i=1; i<items.size();i++)
        {
            m[i]=max(m[i-1],items[i][1]);
        }

        for(int i:queries)
        {
            int l= 0 ;
            int r= m.size()-1;
            int mm=0;
            while(l<=r)
            {
                int mid= (l+r)/2;
                if(items[mid][0]<=i){
                    mm=m[mid];
                    l = mid+1;
                }else{
                    r = mid-1;
                }
            }
            v.push_back(mm);
        }
        return v;
    }
};