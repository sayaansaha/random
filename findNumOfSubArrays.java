import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int findNegSubArrays(int[] nums){
        int sumSoFar = 0;
        int numOfSubArrays = 0;
        for(int i=0; i < nums.length; i++){
            sumSoFar = sumSoFar + nums[i];
            if(sumSoFar < 0){
                numOfSubArrays = numOfSubArrays + 1;
            }
            
        }
        return numOfSubArrays;
    }

    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        int n = keys.nextInt();
        int[] arr = new int[n];
        for (int i=0; i < arr.length; i++){
            arr[i] = keys.nextInt();
        }
        
        findNegSubArrays(arr);
        
        
    }
}