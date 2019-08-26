class Solution {
    public int firstUniqChar(String s) {
        char[] stringToChar = s.toCharArray();
        int[] count = new int[26];
        
        for(char c: s.toCharArray()) {
            count[c-'a'] ++;
        }
        int pos = 0;
        for(char c : s.toCharArray()) {
            if(count[c-'a'] == 1) {
                return pos;
            }
            pos ++;
        }
        return -1;
    }
}
