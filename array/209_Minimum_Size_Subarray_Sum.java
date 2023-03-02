//209. Minimum Size Subarray Sum
// Given an array of positive integers nums and a positive integer target, 
// return the minimal length of a subarray whose sum is greater than or equal 
// to target. If there is no such subarray, return 0 instead.

// Input: target = 7, nums = [2,3,1,2,4,3]
// Output: 2
// Explanation: The subarray [4,3] has the minimal length under the problem constraint.

//slider windows


class Solution{
    public int minSubarrayLen(int s, int[] nums){
       if(nums.length == 0) return 0;
       int sum = 0;
       int result = Integer.MAX_VALUE;

        int slow = 0, fast = 0; 
        for(; fast < nums.length;fast++){
            sum += nums[fast]
            while(sum >= s){
              int min = fast - slow;
              result = Math.min(result, min);
            }
            sum -= nums[slow++];
        }

      return result == Integer.MAX_VALUE ? 0: result;

    }
}