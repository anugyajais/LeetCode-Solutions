class Solution {
    public boolean doesAliceWin(String s) {
        String vowels = "aeiou";
        int n = s.length();

        for( int i=0 ; i<n ; i++){
            char c = s.charAt(i);
            if(vowels.indexOf(c)!= -1){

                return true;
            }
        }
        // if()
        return false;
    }
}