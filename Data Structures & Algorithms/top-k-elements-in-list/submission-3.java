class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new TreeMap<>();
        for(int num : nums ) {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        return map.entrySet().stream()
        .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()) 
        .limit(k)                                                        
        .mapToInt(Map.Entry::getKey)                                    
        .toArray();

    }
}
