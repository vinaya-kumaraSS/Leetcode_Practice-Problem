class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] frequency1 = new int[1001];
        int[] frequency2 = new int[1001];
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<nums1.length || i<nums2.length; i++){
            if(i < nums1.length){
                frequency1[nums1[i]]++;
            }
            if(i < nums2.length){
                frequency2[nums2[i]]++;
            }
        }
        for(int i=0; i<frequency1.length || i<frequency2.length; i++){
            if(frequency1[i] > 0 && frequency2[i] > 0){
                result.add(i);
            }
        }
        int[] res = new int[result.size()];
        for(int i=0; i<res.length; i++){
            res[i] = result.get(i);
        }
        return res;
    }
}
