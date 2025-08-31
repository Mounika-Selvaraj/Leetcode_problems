class Solution(object):
    def topKFrequent(self, nums, k):
        f={}
        for n in nums:
            f[n]=f.get(n,0)+1

        s=sorted(f,key=f.get,reverse=True)
        return s[:k]
        