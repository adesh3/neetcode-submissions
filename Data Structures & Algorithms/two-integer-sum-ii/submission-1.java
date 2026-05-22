class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int [] ans = new int[2];
        for(int i =0, j=nums.length-1; i<j; ) {
            if(nums[i] + nums[j] == target) {
                ans[0] = i+1;
                ans[1] = j+1;
                break;
            } else if(nums[i] + nums[j] > target)
                j--;
            else 
                i++;
        }
        return ans;
    }
}
