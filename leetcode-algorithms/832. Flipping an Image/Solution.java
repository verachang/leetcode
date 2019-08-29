class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0;i < A.length; i++) {
            for(int j=0,k=A[i].length-1; j<k ; j++, k--) {
                int t = A[i][j];
                A[i][j] = A[i][k];
                A[i][k] = t;
           }
        }
        
        for(int i=0; i < A.length; i++) {
            for(int j=0; j < A.length; j++) {
                A[i][j] ^=1;
            }
        }
        
                
        return A;
    }
}
