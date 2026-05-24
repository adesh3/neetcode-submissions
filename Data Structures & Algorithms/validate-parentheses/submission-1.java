class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        
        Map<Character, Character> map = Map.of(')', '(', ']', '[', '}', '{');
        for(char c: s.toCharArray()) {
            if(c=='(' || c== '[' || c== '{') {
                st.push(c);
            } else {
                if(st.size() == 0 || st.pop() != map.get(c))
                    return false;
            }
        }
        if(st.size()!= 0)
            return false;
        return true ;
    }
}
