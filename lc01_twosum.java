class Solution {
    public int[] twoSum(int[] nums, int target) {
             HashMap<Integer, Integer> map = new HashMap();
        int n = nums.length;
        int remaining_sum;
        System.out.println(target);
        for(int i = 0; i < n; i++){
            remaining_sum = target - nums[i];
            
            if(map.containsKey(remaining_sum)) return new int[]{map.get(remaining_sum), i};
            else map.put(nums[i], i);
        }
        return new int[]{};   
    } 
}