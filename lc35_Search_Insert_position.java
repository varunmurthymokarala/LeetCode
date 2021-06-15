#(Binary search)
class Solution {
    public int searchInsert(int[] nums, int target) {
          int left = 0, right = nums.length-1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] ==  target){
                return mid;
            }else if(nums[mid] < target){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return (nums[left] < target) ? left + 1 : left;
        
    }
}

-----------------------------------------------------------------------------

class Solution {
    public int searchInsert(int[] nums, int target) {
            int n = nums.length;
            int i = 0;
            if (n == 0) return 0;
                for(i = 0; i < n; i++){
            if(target < nums[i] || target == nums[i]) return i;
            }
        return i;
    }
}