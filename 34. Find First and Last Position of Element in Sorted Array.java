class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = result[1] = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result[0] = i;
                result[1] = i;
                while (i + 1 < nums.length && nums[i + 1] == target) {
                    i++;
                    result[1] = i;
                }
            }
        }
        return result;
    }
}
