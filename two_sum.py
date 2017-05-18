class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        curr_sum = 0

        while(curr_sum != target):
            for a in nums:
                
