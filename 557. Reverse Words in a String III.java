class Solution {
    public String reverseWords(String s) {
        String[] strArr = s.split(" ");
        for(int i=0; i<strArr.length; i++){
            strArr[i] = reverse(strArr[i],0, strArr[i].length()-1);
        }
        
        String result = String.join(" ", strArr);
        return result;
    }
    public String reverse(String txt , int start, int end){
        char[] txtArr = txt.toCharArray();
        while(start <= end){
            char temp = txtArr[start];
            txtArr[start] = txtArr[end];
            txtArr[end] = temp;
            start++;
            end--;
        }
        return new String(txtArr);
    }
}
