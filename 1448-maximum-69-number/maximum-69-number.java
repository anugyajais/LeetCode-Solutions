class Solution {
    public int maximum69Number(int num) {
        char nn[] = String.valueOf(num).toCharArray();
        for (int i = 0; i < nn.length; i++) {
            if (nn[i] == '6') {
                nn[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(nn));
    }
}