class Solution {
public:
    vector<int> vowelStrings(vector<string>& words, vector<vector<int>>& queries) {
        
        vector<int>prefix(words.size(),0);
        auto isv=[](char c){
            return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
        };
        prefix[0]=isv(words[0][0]) && isv(words[0].back()) ? 1 : 0;
        for(int i=1; i<words.size(); i++)
        {
            prefix[i] = prefix[i - 1] + (isv(words[i][0]) && isv(words[i].back()) ? 1 : 0);
        }
        vector<int>ans;
        for(const auto&q:queries)
        {
            int li=q[0], ri=q[1];
            ans.push_back(li==0?prefix[ri]: prefix[ri]-prefix[li-1]);
        }
        return ans;
        
    }
};