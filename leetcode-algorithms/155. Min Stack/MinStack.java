class MinStack {
    Stack <Integer> mStack;
    Stack <Integer> mMinStack;

    /** initialize your data structure here. */
    public MinStack() {
        mStack = new Stack<>();
        mMinStack = new Stack<>();
    }
    
    public void push(int x) {
        mStack.push(x);
        
        if(mMinStack.isEmpty()) {
            mMinStack.push(x);
        } else {
            if(mMinStack.peek() > x) {
                mMinStack.push(x);
            } else {
                mMinStack.push(mMinStack.peek());
            }
        }
    }
    
    public void pop() {
        mStack.pop();
        mMinStack.pop();
    }
    
    public int top() {
        return mStack.peek();
    }
    
    public int getMin() {
        return mMinStack.pop();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
