
public class Solution {
	public int[] maxSubArray(int[] nums){
		int maxSoFar;
		int maxEndingHere= 0;

		for(int i = 0; i < nums.length(); i++){
			maxEndingHere = maxEndingHere + nums[i];
			if(maxEndingHere < 0){
				maxEndingHere = 0;
				if(maxEndingHere > maxSoFar){
					maxSoFar = maxEndingHere;
				}
			}
			return maxSoFar;
		}


		}
}