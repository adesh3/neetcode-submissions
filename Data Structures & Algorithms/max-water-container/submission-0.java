class Solution {
    public int maxArea(int[] nums) {
        int ans = 0;

        for(int i=0, j = nums.length-1; i<j; ) {
            ans = Math.max(Math.min(nums[i],nums[j])* (j-i), ans);
            if(nums[i]> nums[j])
                j--;
            else 
                i++;
        }
        return ans;
    }
}
