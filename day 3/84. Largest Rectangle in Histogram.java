class Solution {
   
    public int[] nextSmaller(int[] arr) {
        int n = arr.length;
        int[] nextS = new int[n];
        Arrays.fill(nextS, n);
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                nextS[stack.pop()] = i;
            }
            stack.push(i);
        }
        
        return nextS;
    }
    public int[] prevSmaller(int[] arr) {
        int n = arr.length;
        int[] prevS = new int[n];
        Arrays.fill(prevS, -1);
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                prevS[i] = stack.peek();
            }
            stack.push(i);
        }
        
        return prevS;
    }

    public int largestRectangleArea(int[] heights) {
        
        int[] prevS = prevSmaller(heights);
        int[] nextS = nextSmaller(heights);
        
        int maxArea = 0;
        
        for (int i = 0; i < heights.length; i++) {
            int width = nextS[i] - prevS[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        
        return maxArea;
    }
}
    