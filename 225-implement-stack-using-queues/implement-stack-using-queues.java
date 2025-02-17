class MyStack {
    ArrayList<Integer> arr;

    public MyStack() {
       arr = new ArrayList<>();
    }
    
    public void push(int x) {
        arr.add(x);
    }
    
    public int pop() {
        int ele = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);
        return ele;
    }
    
    public int top() {
        return arr.get(arr.size() - 1);
    }
    
    public boolean empty() {
        return arr.size()==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */