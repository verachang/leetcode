class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=digits.length-1; i >=0; i--) {
            if(digits[i] < 9) {
                digits[i] ++;
                return digits;
            } else {
                digits[i] = 0;
            }   
        }
        
        int [] numarray = new int [n+1];
        numarray[0] = 1;
        return numarray;
    }
}
