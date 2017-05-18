import java.lang.*;


public class Solution {
    public int[] twoSum(int[] nums, int target) {
      int sumSoFar;
      int startIndex;
      int endIndex;
      for(int i =0; i < nums.length; i++){
        for (int j=0; j <nums.length; j++) {
        	sumSoFar = sumSoFar + nums[j]
        	if(sumSoFar == target){
        		startIndex = i;
        		endIndex = j;
        		break;
        	}
        }
      }

    }
}
