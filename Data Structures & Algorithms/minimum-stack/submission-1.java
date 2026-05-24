class MinStack {

    Stack<MiniStack> st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        int min = val;
        if(st.size()>0)
            min = Math.min(st.peek().min, min);
        st.push(new MiniStack(val,min));
    }
    
    public void pop() {
        if(st.size()>0)
            st.pop();
    }
    
    public int top() {
        return st.peek().val;
    }
    
    public int getMin() {
        return st.peek().min;
    }
}

class MiniStack {
    int val;
    int min;
    MiniStack(int i , int j) {
        this.val = i ;
        this.min = j;
    }
}
