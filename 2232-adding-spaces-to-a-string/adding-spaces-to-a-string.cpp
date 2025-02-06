class Solution {
public:
    string addSpaces(string s, vector<int>& spaces) {
        int c=0;
        int l= s.size()+spaces.size();
        string ss="";
        int ind=0;
        // cout<<spaces[ind]<<endl;
        for(int i=0; i<s.size();i++)
        {
            // cout<<spaces[ind]<<" "<<i<<endl;
            if( ind<spaces.size() && i==spaces[ind] )
            {
                ss.push_back(' ');
                ind++;
            }
            // else
            {
                ss.push_back(s[i]);
            }
            
        }
        return ss;
    }
};