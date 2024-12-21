class Solution {
    public int getMin(int[] nums){
        int minValue = Integer.MAX_VALUE;
        int minIndex = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < minValue && nums[i] != 0){
                minIndex = i;
                minValue = nums[i];
            }
        }
        nums[minIndex] = 0;
        return minValue;
    }
    public static int getMax(int[] nums){
        int maxValue = Integer.MIN_VALUE;
        int maxIndex = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > maxValue && nums[i] != 0){
                maxIndex = i;
                maxValue = nums[i];
            }
        }
        nums[maxIndex] = 0;
        return maxValue;
    }
    public double minimumAverage(int[] nums) {
        double[] result = new double[nums.length/2];
		for(int i=0; i<nums.length/2; i++){
                result[i] = (getMin(nums)+getMax(nums)) / 2.0;
		}
        double min = Integer.MAX_VALUE;
        for(int i=0; i<result.length; i++){
            if(result[i] < min){
                min = result[i];
            }
        }
        return min;
    }
}
