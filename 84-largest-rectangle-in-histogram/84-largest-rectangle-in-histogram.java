class Solution {
//      Noice Question
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int[] leftMin = new int[len];
        Stack<Integer> leftStack = new Stack<>();
        Arrays.fill(leftMin, -1);
        for(int i = len - 1; i >= 0; -- i) {
            while(! leftStack.isEmpty() && heights[leftStack.peek()] > heights[i]) {
                leftMin[leftStack.pop()] = i;
            }
            leftStack.push(i);
        }
        
        int[] rightMin = new int[len];
        Stack<Integer> rightStack = new Stack<>();
        Arrays.fill(rightMin, len);
        for(int i = 0; i < len; ++ i) {
            while(!rightStack.isEmpty() && heights[rightStack.peek()] > heights[i]) {
                rightMin[rightStack.pop()] = i;
            }
            rightStack.push(i);
        }
        int maxArea = Integer.MIN_VALUE;
        for(int i = 0; i < len; ++ i) {
            maxArea = Math.max(maxArea, heights[i] * (rightMin[i] - 1 - leftMin[i]));
        }
        return maxArea;
    }
}