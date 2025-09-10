class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Place numbers in their correct position if possible
        for (int i = 0; i < n; i++) {
            while (
                nums[i] > 0 &&
                nums[i] <= n &&
                nums[nums[i] - 1] != nums[i]
            ) {
                // Swap nums[i] to its correct place
                int correctIndex = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }

        // After rearrangement, find first missing positive
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // If all numbers 1 to n are present
        return n + 1;
    }
}