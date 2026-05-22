class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int ans = 0;
        for(int i=0; i< s.length(); i++) {
            char c = s.charAt(i);
            if(!map.containsKey(c)) {
                map.put(c, i);
                ans = Math.max(ans, i-start+1);
            } else {
                int start1 = map.get(c)+1;
                for(int j= start ; j< start1; j++)  
                    map.remove(s.charAt(j));
                start = start1;
                map.put(c, i); 
                
            }
            System.out.println(map);
            ans = Math.max(ans, i-start+1);
        }
        return ans;
        
    }
}
