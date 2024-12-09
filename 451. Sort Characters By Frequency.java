class Solution {
    public static void getResult(StringBuilder result, char c, int num){
        for(int i=1; i<=num; i++){
            result.append(c);
        }
    }

    public String frequencySort(String s) {
        int[][] arr = new int[128][2]; 
        for (char c : s.toCharArray()) {
            arr[c][0] = c;      
            arr[c][1]++;        
        }


        StringBuilder result = new StringBuilder();

        Arrays.sort(arr, Comparator.comparingInt(row -> -row[1])); 

        for (int[] row : arr) {
            if (row[1] > 0) { 
                getResult(result,(char) row[0], row[1]);
            }
        }

        return new String(result);
}
}
