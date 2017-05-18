 """
        :type nums: List[int]
        :rtype: int
        """

class Solution(object):
    def maxSubArray(self, nums):
       mid_point = len(nums)/2
       #base case. array is of size 0
       if(len(nums) == 0 or len(nums) == 1):
       	return nums[0]
       else 


