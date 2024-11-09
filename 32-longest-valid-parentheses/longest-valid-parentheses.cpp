class Solution {
public:
    int longestValidParentheses(string s) {
        stack <int> ss;
        int c =0;
        ss.push(-1);
        for(int i=0 ; i<s.size();i++)
        {
            if(s[i]=='(')
            {
                ss.push(i);
            }
            else
            {
                ss.pop();
                if(ss.empty())
                {
                    ss.push(i);
                }
                else
                {
                    c= max(c , i-ss.top());
                }
            }
        }
        return c;
    }
};