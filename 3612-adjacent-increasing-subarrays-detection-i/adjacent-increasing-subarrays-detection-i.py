class Solution(object):
    def hasIncreasingSubarrays(self, nums, k):
        n = len(nums)

        # Helper: check if nums[start:start+k] is strictly increasing
        def is_increasing(start):
            for i in range(start, start + k - 1):
                if nums[i] >= nums[i + 1]:
                    return False
            return True

        # Check all possible adjacent pairs
        for a in range(n - 2 * k + 1):
            b = a + k
            if is_increasing(a) and is_increasing(b):
                return True
        return False
