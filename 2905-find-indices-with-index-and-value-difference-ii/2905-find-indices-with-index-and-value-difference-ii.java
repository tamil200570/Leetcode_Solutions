class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = indexDifference; i < nums.length; i++) {

            // New index becomes eligible
            int j = i - indexDifference;

            // Track minimum and maximum values
            if (nums[j] < nums[minIndex]) {
                minIndex = j;
            }

            if (nums[j] > nums[maxIndex]) {
                maxIndex = j;
            }

            // Check with minimum value
            if (nums[i] - nums[minIndex] >= valueDifference) {
                return new int[]{minIndex, i};
            }

            // Check with maximum value
            if (nums[maxIndex] - nums[i] >= valueDifference) {
                return new int[]{maxIndex, i};
            }
        }

        return new int[]{-1, -1};
    }
}