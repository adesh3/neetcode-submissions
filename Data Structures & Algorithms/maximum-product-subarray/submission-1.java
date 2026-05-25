class Solution {
    public int maxProduct(int[] nums) {

        if(nums.length == 1)
            return nums[0];
        int min = nums[0];
        int max = nums[0];
        
        boolean hasZero = false;
        int res = nums[0];

        for(int i=1;i<nums.length;i++) {
            int temp = Math.max(max*nums[i],Math.max(nums[i], min*nums[i]));
            min = Math.min(nums[i], Math.min(nums[i]*min, max*nums[i]));
            max = temp;

            res = Math.max(res, max);
        }

        return res;
        
    }
}
