//2.28
//Binary search
//左闭右闭
class Solution {
    public int search(int[] nums, int target) {
        if(target < nums[0] || target >nums[nums.length-1])
        return -1;

        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right - left) / 2 ;
            if(target > nums[mid]){
                left = mid + 1;
            }else if(target < nums[mid]){
                right = mid -1;
            }else if (nums[mid] == target){
                return mid;
            }

        }
        return -1;

    }
}

//34. search insert position
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


//3.1
//34. Find First and Last Position of element in sorted array
class Solution {
    public int[] searchRange(int[] nums, int target) {
        
    }

    public int searchLeft(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int leftBorder = -2;
        while(left<=right){ //左边界等于找到第一个比target小的数字
            int mid = left + (right - left) / 2;
            if(target <= nums[mid]){
                right = mid-1;
                leftBorder = right;
            }else {
                left = mid + 1;
            }
        }
        return leftBorder;
    }
}