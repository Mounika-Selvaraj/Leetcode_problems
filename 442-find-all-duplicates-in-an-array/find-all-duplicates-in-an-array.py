class Solution(object):
    def findDuplicates(self, nums):
       a=[]
       s=set()
       for i in nums:
        if i in s:
            a.append(i)
        else:
            s.add(i)
       return a
            

        