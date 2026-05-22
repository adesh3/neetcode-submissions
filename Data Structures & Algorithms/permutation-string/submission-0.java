class Solution {
    public boolean checkInclusion(String s1, String s2) {
       Map<Character, Integer> map = new HashMap<>();

        if(s1.length() > s2.length())
            return false;

        for(char c: s1.toCharArray())
            map.put(c, map.getOrDefault(c,0)+1);
        int left = 0;
        for(int i = 0 ; i< s2.length() ; i++) {
            if(map.containsKey(s2.charAt(i))) {
                map.put(s2.charAt(i), map.get(s2.charAt(i))-1);
                if(map.get(s2.charAt(i)) < 0 ) {
                    while(left < s2.length() && left <= i && s2.charAt(i)!= s2.charAt(left)) {
                        map.put(s2.charAt(left), map.get(s2.charAt(left))+1);
                        left++;
                    }
                    left++;
                }
            } 
            if( !map.containsKey(s2.charAt(i))) {
                while(left < s2.length() && left < i) {
                    map.put(s2.charAt(left), map.get(s2.charAt(left))+1);
                    left++;
                } 
                left = i+1;  
            } 
            
            System.out.println(i+" "+ left);
            if(i-left+1 == s1.length()) {
                
                return true;
            }
        }
       return false;
    }
}
