class Solution {
    public static void getAll(List<String> result, String str, int open, int closed, int n){
        if(str.length() == n*2){
            result.add(str);
            return;
        }
        if(open < n){
            getAll(result, str+"(", open+1, closed,n);
        }
        if(closed < open){
            getAll(result, str+")", open, closed+1, n);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
            getAll(result, "(", 1, 0, n);
            return result;
    }
}
