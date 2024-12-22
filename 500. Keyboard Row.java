class Solution {
    public String[] findWords(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        
        for (char c : "qwertyuiop".toCharArray()) {
            map.put(c, 1);
        }
        for (char c : "asdfghjkl".toCharArray()) {
            map.put(c, 2);
        }
        for (char c : "zxcvbnm".toCharArray()) {
            map.put(c, 3);
        }

        ArrayList<String> list = new ArrayList<>();
        
        for (String word : words) {
            int firstRow = map.get(Character.toLowerCase(word.charAt(0)));  
            boolean canBeTyped = true;

            for (int j = 1; j < word.length(); j++) {
                if (map.get(Character.toLowerCase(word.charAt(j))) != firstRow) {
                    canBeTyped = false;
                    break;
                }
            }
            if (canBeTyped) {
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }
}
