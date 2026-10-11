class Solution {
public:
    vector<int> findValidElements(vector<int>& nums) {
        int n = nums.size();
        if (n <= 2) return nums;

        vector<int> result;

        // Precompute maximum element to the right of each index
        vector<int> rightMax(n);
        rightMax[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = max(rightMax[i + 1], nums[i]);
        }

        int leftMax = -1; // Stores max element to the left

        for (int i = 0; i < n; i++) {
            // First and last elements are always valid
            if (i == 0 || i == n - 1) {
                result.push_back(nums[i]);
            } else {
                // Valid if strictly greater than ALL left elements OR ALL right elements
                if (nums[i] > leftMax || nums[i] > rightMax[i + 1]) {
                    result.push_back(nums[i]);
                }
            }
            // Update running left max
            leftMax = max(leftMax, nums[i]);
        }

        return result;
    }
};