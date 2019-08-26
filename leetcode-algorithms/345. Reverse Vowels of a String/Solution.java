class Solution {
    public String reverseVowels(String s) {
        char[] stringTochar = s.toCharArray();
        int left = 0;
        int right = stringTochar.length -1;
        while(left < right) {
            if(isVowelse(stringTochar[left]) && isVowelse(stringTochar[right])){
                char tmp = stringTochar[right];
                stringTochar[right] = stringTochar[left];
                stringTochar[left] = tmp;
                left ++;
                right --;
            } else {
                if (!isVowelse(stringTochar[left])) {
                    left ++;
                } 
                if (!isVowelse(stringTochar[right])) {
                    right --;
                }
            }
        }
        return new String(stringTochar);
    }
    
    public static boolean isVowelse(char c) {
        if ('a' == c || 'e' == c || 'i' == c || 'o' == c || 'u' == c
                || 'A' == c || 'E' == c || 'I' == c || 'O' == c || 'U' == c) {
            return true;
        }
        return false;
    }
}
