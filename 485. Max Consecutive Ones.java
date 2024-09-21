class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int current_count = 0;
        int maximum_count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                current_count++;
                maximum_count = Math.max(current_count, maximum_count);
            }
            else
                current_count = 0;
        }
        return maximum_count;
    }
}
