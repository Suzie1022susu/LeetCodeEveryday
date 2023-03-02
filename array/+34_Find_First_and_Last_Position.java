//34. Find First and Last Position of element in sorted array
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a = searchLeft(nums, target);
        int b = searchRight(nums, target);
        
        if(a == -2 || b == -2)return new int[]{-1,-1};
        if(b - a > 1 ) return new int[]{a + 1, b-1};
        return new int[]{-1,-1};
    }

    public int searchLeft(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int leftBorder = -2;
        while(left<=right){ 
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

    public int searchRight(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int rightBorder = -2;
        while(left <= right){
            int mid = left + (right- left) / 2;
            if(target < nums[mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
                rightBorder = left;
            }
            
        } 
        return rightBorder;
    }
}