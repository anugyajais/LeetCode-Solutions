class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        // StringTokenizer st  = new StringTokenizer(text, " ");
        String st[] = text.split(" ");
        int n = st.length;
        int ans =n;
        for(String w: st){
            
            for(char ch: brokenLetters.toCharArray()){
                
                if(w.indexOf(ch)>= 0){
                   ans--;
                   break; 
                }
            }
        }
        // if(ans<0) return 0;
        return ans;

    }
}


// q1 write a func to calculate sum and prod of all numbers in an array
// q2 write a func to swap the max and min number of an aray
// q3 write a func to print all the unique values in an array
// q4 write a func to priint intersection of 2 arrays

