class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray() ) {
            if(Character.isLetterOrDigit(c)) {
                sb.append(String.valueOf(c));
            }
        }
        
        String sbR = new String(sb.reverse()).toString();
        System.out.println(sb + "| "+ sbR);
        return sb.reverse().toString().toLowerCase().equals(sbR.toLowerCase());
    }
}
