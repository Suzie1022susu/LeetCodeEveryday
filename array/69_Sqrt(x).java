// Given a non-negative integer x, return the square root of x rounded down 
// to the nearest integer. The returned integer should be non-negative as well.

// Input: x = 4
// Output: 2
// Explanation: The square root of 4 is 2, so we return 2.


class Solution {
    public int mySqrt(int x) {
        if(x == 1) return 1;
        int left = 0;
        int right  = x / 2 + 1;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if((long)mid * mid > x){
                right = mid - 1;
            }else if((long)mid * mid < x){
                left = mid + 1;
            }else{
                return mid;
            }
        }
        return right;
    }
}