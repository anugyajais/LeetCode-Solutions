class Solution {
    public boolean isValid(String s) {

        char arr[] = s.toCharArray();
        if(s.length()%2!=0){
            return false;
        }

		Stack<Character> stack = new Stack<>();

		// stack.push(arr[0]);
		for (char c : arr) {

			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else {
                if(stack.isEmpty()) return false;
				char ch = stack.pop();
				
				if (ch == '(') {
					if(c!=')')
					return false;
				}
				else if (ch == '{') {
					if (c != '}')
					return false;
				}
				else if (ch == '[') {
					if (c != ']')
					return false;
				}
			}
		}
		return stack.isEmpty();
    }
}