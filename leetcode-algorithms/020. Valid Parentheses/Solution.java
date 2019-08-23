class Solution {
    public boolean isValid(String s) {
        char[] stringToCharArray = s.toCharArray();
        java.util.Stack<Character> characterST = new java.util.Stack<Character>();
        for(char c:stringToCharArray) {
            switch(c) {
                case ')':
                    if (characterST.empty() || characterST.pop() != '(')
                          return false;
                    break;
                case '}':
                    if(characterST.empty() || characterST.pop() !='{')
                        return false;
                    break;
                case ']':
                    if(characterST.empty() || characterST.pop() != '[')
                        return false;
                    break;
                default:
                    characterST.push(c);
                    break; 
            }
        }
        return characterST.empty();
    }
}
