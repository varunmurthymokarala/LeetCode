class Solution {
    public int maxSubArray(int[] nums) {
        int sum =0, maximumSum = Integer.MIN_VALUE;
        for(int num : nums){
            sum = Math.max(sum,0) + num;
            maximumSum = Math.max(maximumSum, sum);
        }
        return maximumSum;
    }
}