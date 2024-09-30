import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        Arrays.sort(strs);
        String resString = "";
        
        String first = strs[0];
        String last = strs[strs.length - 1];
        
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                resString = resString + first.charAt(i);
            } else {
                break;
            }
        }
        
        return resString.toString();
    }
}
