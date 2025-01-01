class Solution {
public:
    int maxScore(string s) {
        int ones = count(s.begin(), s.end(), '1');
        int maxS = 0, zeros = 0;
        for (int i = 0; i < s.length() - 1; ++i) {
            if (s[i] == '0') {
                zeros++;
            } else {
                ones--;
            }
            maxS = max(maxS, zeros + ones);
        }
        return maxS;
    }
};