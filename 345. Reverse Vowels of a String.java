class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length()-1;
        char[] ch = s.toCharArray();
        while(start < end){
            if(!isVowel(ch[start])){
                start++;
            }
            if(!isVowel(ch[end])){
                end--;
            }
            if(isVowel(ch[start]) && isVowel(ch[end])){
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }
    boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')?true:false);
    }
}
