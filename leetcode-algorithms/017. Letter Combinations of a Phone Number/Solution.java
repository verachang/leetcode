class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<String>();
        List<String> numberMap = new ArrayList<>();
        String[] map = new String[]{" ", 
                                  "", 
                                  "abc",
                                  "def",
                                  "ghi",
                                  "jkl",
                                  "mno",
                                  "pqrs",
                                  "tuv",
                                  "wxyz"};
        numberMap.add("");

        for(char c: digits.toCharArray()) {
            List<String> tmp = new ArrayList<>();
            for(String s: numberMap) {
                String number = map[Character.getNumericValue(c)];
                for(char a: number.toCharArray()) {
                    tmp.add(s + a);
                }
            }
            numberMap = tmp;
        }
         
        return numberMap;
    }
}
