class Solution {
    public char findTheDifference(String s, String t) {
        int totalAscii = 0;
        for(int i = 0; i < t.length(); i++){
            totalAscii = totalAscii + t.charAt(i);
        }
        for(int i = 0; i < s.length(); i++){
            totalAscii = totalAscii - s.charAt(i);
        }
        return (char) totalAscii;
    }
}
