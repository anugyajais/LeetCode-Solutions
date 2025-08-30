class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Character, Integer>[] rr = new HashMap[9];
        Map<Character, Integer>[] cc = new HashMap[9];
        for (int i = 0; i < 9; i++) {
            rr[i] = new HashMap<>();
            cc[i] = new HashMap<>();
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char val = board[i][j];
                if (val != '.') {
                    rr[i].put(val, rr[i].getOrDefault(val, 0) + 1);
                    cc[j].put(val, cc[j].getOrDefault(val, 0) + 1);
                    if (rr[i].get(val) > 1 || cc[j].get(val) > 1) {
                        return false;
                    }
                }
            }
        }
        for (int block = 0; block < 9; block++) {
            Set<Character> seen = new HashSet<>();
            int r1 = 3 * (block / 3);
            int c1 = 3 * (block % 3);
            for (int i = r1; i < r1 + 3; i++) {
                for (int j = c1; j < c1 + 3; j++) {
                    char val = board[i][j];
                    if (val != '.') {
                        if (seen.contains(val)) {
                            return false;
                        }
                        seen.add(val);
                    }
                }
            }
        }

        return true;
    }
}