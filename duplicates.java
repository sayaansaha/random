
/*Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, 
and it should return false if every element is distinct.*/


public class Solution {
    // O(n2) soltuion. 
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0 ; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    //Soliution in O(n)
    public boolean containsDuplicate2(int[] nums){
        Set<Integer> set = new HashSet<Integer>();
            for( int i : nums){
                if(set.contains(i)){
                    return true;
                }
                set.add(i);
            }
            return false;
        }
}