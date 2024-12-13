class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[] stonesFreq = new int[123]; 

        for (int i = 0; i < stones.length(); i++) {
            stonesFreq[stones.charAt(i)]++;
        }

        int count = 0;

        for (int i = 0; i < jewels.length(); i++) {
            count += stonesFreq[jewels.charAt(i)];
        }

        return count;
    }
}
