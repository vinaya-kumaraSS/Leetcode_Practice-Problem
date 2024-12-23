class Solution {
    public int findComplement(int num) {
        int mask = Integer.highestOneBit(num); 
        mask = (mask << 1) - 1;
        return num ^ mask;
    }
}
