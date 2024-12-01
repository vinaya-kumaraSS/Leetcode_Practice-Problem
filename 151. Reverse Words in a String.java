class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split(" +");
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return String.join(" ", arr);
    }
}
