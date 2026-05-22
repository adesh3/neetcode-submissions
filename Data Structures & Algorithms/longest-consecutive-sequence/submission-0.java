class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : nums) {
            set.add(i);
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        int ans = 0;
        int count = 0;

        for(int i=min; i<= max;i++) {
            if(set.contains(i)) {
                count++;
                ans = Math.max(count, ans);
            } else {
                count = 0;
            }
        }
        return ans;

       
    }
}
