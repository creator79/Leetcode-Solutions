class StockSpanner {
    
    // Step 1: Create a list to store prices
    List<Integer> stocks = null;
    
    // Step 2: Create a stack to store index of prices
    Stack<Integer> stack = null;
    
    // Step 3: Create a variable to track index of current price in list
    int index = -1;

    // Step 4: Initialize list & stack
    public StockSpanner() {        
        stocks = new ArrayList<>();
        stack = new Stack<>();        
    }
    
    public int next(int price) {
        
        int result = 1;
        
        // Step 5: Insert price in list
        stocks.add(price);
        
        // Step 6: Keep track of current price index in list
        index++;
        
        // Step 7: Remove all indices from stack whose value is <= price
        while((stack.size() > 0) && (stocks.get(stack.peek()) <= price)){
            stack.pop();
        }
        
        // Step 8: If stack is empty, means no greater element found on left side
        if(stack.size() == 0){
            result = index + 1;
        }
        // Step 9: Else, return difference between current index & greatest index on left
        else{                
            result = index - stack.peek();
        }
        
        // Step 10: Push the current price in stack
        stack.push(index);
        
        return result;
        
    }
}
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */