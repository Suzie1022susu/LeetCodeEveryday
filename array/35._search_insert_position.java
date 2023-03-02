//34. search insert position
// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, 
// return the index where it would be if it were inserted in order.

// Input: nums = [1,3,5,6], target = 5
// Output: 2


class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target < nums[0]) return 0;
        if(target > nums[nums.length-1]) return nums.length;

        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left )/2 ;
            if(nums[mid] == target)
            { 
                return mid;
                }else if(target > nums[mid]){
                    left = mid + 1;
                }else if(target < nums[mid]){
                    right = mid - 1;
                }
        }
        return left;
    }
}
