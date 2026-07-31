class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            // Count all shorter people
            while (!stack.isEmpty() && stack.peek() < heights[i]) {
                ans[i]++;
                stack.pop();
            }

            // Count the first taller or equal person
            if (!stack.isEmpty()) {
                ans[i]++;
            }

            stack.push(heights[i]);
        }

        return ans;
    }
}