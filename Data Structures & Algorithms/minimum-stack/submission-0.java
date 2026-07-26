class MinStack {
    List<Integer> stack;
    List<Integer> prefix;
    int items = 0;

    public MinStack() {
        stack  = new ArrayList<>();
        prefix = new ArrayList<>();
        items = 0;
    }
    
    public void push(int val) {
        if (prefix.size() == 0) prefix.add(val);
        else prefix.add(Math.min(prefix.get(prefix.size() - 1), val));
        stack.add(val);
        items++;
    }
    
    public void pop() {
        stack.remove(items - 1);
        prefix.remove(items - 1);
        items--;
    }
    
    public int top() {
        return stack.get(items - 1);
    }
    
    public int getMin() {
        return prefix.get(items - 1);
    }
}
