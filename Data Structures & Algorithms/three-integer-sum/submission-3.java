class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i<nums.length-2; ) {
            if(i>0) {
                while(i < nums.length && nums[i] == nums[i-1])
                    i++;
             
            }
            for(int j=i+1, k = nums.length-1; j<k;) {
                if(nums[i] + nums[j] + nums[k] == 0) {
                    list.add(List.of(nums[i], nums[j], nums[k]));
                    while(j<k && nums[j] == nums[j+1])
                    j++;
                    j++;
                    k--;
                } else if(nums[i] + nums[j] + nums[k] > 0)  {
                    k--;
                } else {
                    j++;
                }
            }
            i++;

        }
        return list;
        
    }
}
