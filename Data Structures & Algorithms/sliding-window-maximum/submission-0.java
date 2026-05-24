class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(new Comparator<Pair>() {
            public int compare(Pair i, Pair j) {
                return j.val - i.val;
            }
        });

        for(int i=0;i<k;i++) {
            pq.add(new Pair(nums[i], i));
        } 
        ans.add(pq.peek().val);

        for(int i=k;i<nums.length; i++) {
            pq.add(new Pair(nums[i], i));
            while(pq.peek().index <i-k+1)
                pq.poll();
            ans.add(pq.peek().val);
        }

        return ans.stream().mapToInt(i -> i).toArray();
    }

    
}

class Pair {
    public int val; 
    public int index;
    Pair(int i, int j) {
        this.val = i;
        this.index = j;
    }
}

