class Solution(object):
    def search(self, nums, t):
        l=0
        r=len(nums)-1
        while(l<=r):
            m=(l+r)//2
            if t==nums[m]:
                return m
            elif t>nums[m]:
                l=m+1
            else:
                r=m-1
        return -1