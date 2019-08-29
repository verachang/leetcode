class Solution {
    public boolean judgeCircle(String moves) {
        char[] charArray = moves.toCharArray();
        int x = 0, y = 0;
        for(int i = 0; i < charArray.length; i++) {
            switch(charArray[i]) {
                case 'R':
                    y= y+1;
                    break;
                case 'L':
                    y=y-1;
                    break;
                case 'U':
                    x = x+1;
                    System.out.print("U, x = "+x+"\n");
                    break;
                case 'D':
                    x =x-1;
                    System.out.print("D, x = "+x+"\n");
                    break;
            }
            
        }
        if(x == 0 && y == 0) {
            return true;
        }
        return false;
    }
}
