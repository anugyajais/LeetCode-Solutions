class Solution {
public:
    int maxScoreSightseeingPair(vector<int>& values) {
        int n = values.size();
        vector<int> maxx(n);
        maxx[0] = values[0];
        int ans = 0;
        for (int i = 1; i < n; i++) {
            int cr = values[i] - i;
            ans = max(ans, maxx[i - 1] + cr);
            int cl = values[i] + i;
            maxx[i] = max(maxx[i - 1], cl);
        }
        return ans;
    }
};