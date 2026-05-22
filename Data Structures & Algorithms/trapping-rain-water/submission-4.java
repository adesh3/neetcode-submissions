class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n<3)
            return 0;
        int ans = 0;
        int top = 0;

        Stack<Integer> st = new Stack<>();
        for(int i =0;i<n;i++) {
            if(st.size() == 0) {
                st.push(height[i]);
                top  = height[i];
            }
            else {

                Stack<Integer> st2 = new Stack<>();    
                while(st.size() > 0 && height[i] > st.peek()) {
                    int k = st.pop();
                    int m = Math.min(top,height[i]);
                    ans+= (m-k);
                    st2.push(m);

                }
                while(st.size() != 0 && st2.size() > 0) {
                    st.push(st2.pop());
                }
                st.push(height[i]);
                top = Math.max(top, height[i]);
                
            }
            //System.out.println(st);
        }
        return ans;
    }
}
