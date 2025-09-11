class Solution {
    public String sortVowels(String s) {
        int n = s.length();
        // char v[] = new char[n];
        String v="";
        char ss[] =s.toCharArray();
        String vowels = "AEIOUaeiou";
        for(char c: ss){
            if(vowels.indexOf(c)!= -1){
                v=v+""+c;
            }
        }
        char vv[] = v.toCharArray();
        Arrays.sort(vv); 
        int k=0;
        String ans = "";
        for(int i=0;i<s.length(); i++){

            char ch = s.charAt(i);
            if(vowels.indexOf(ch)== -1){
                ans = ans + ""+ ch;
            }
            else{
                ans = ans + "" + vv[ k++];
            }
            

        }
        return ans;

    }
}