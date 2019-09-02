class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n < 0) {
            return result;
        }
        generate(n,n,"",result);
        
        return result;
    }
    
    public void generate(int left, int right, String tmp, List<String> tmpresult) {
        if(right < left) {
            return;
        }
        if(left == 0 && right == 0) {
            tmpresult.add(tmp);
        }
        if(left > 0) {
            generate(left -1, right, tmp + "(" , tmpresult);
        }
        if(right > 0) {
            generate(left, right-1, tmp + ")" ,tmpresult);
        }
    }
}
