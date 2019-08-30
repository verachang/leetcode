class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<String>(); 
        for(int i = 0; i < emails.length; i ++) {
            String tmpEmail = emails[i];
            String start = "", end = "";
            if(tmpEmail.indexOf('@')!=0) {
                start = tmpEmail.substring(0, tmpEmail.indexOf('@'));
                end = tmpEmail.substring(tmpEmail.indexOf('@'), tmpEmail.length());
                
                if(start.indexOf('+') > 0) {
                    String tmpName = start.substring(0, start.indexOf('+'));
                    if (tmpName.indexOf('.') > 0) {
                        start = cutString(tmpName);
                    } else {
                        start = tmpName;
                    }
            } else if (start.indexOf('.') > 0) {
                    start = cutString(start);
                }
            }
            String fullEmail = start + end;
            
            if(!set.contains(fullEmail)) {
                set.add(fullEmail);
            }
        }
        return set.size();
    }
    
    public String cutString(String name) {
        String tmp = "";
        while (name.indexOf('.') >= 0) {
            tmp = tmp + name.substring(0, name.indexOf('.'));
            name = name.substring(name.indexOf('.')+1 ,name.length() );
        }
        return tmp+name;
    }
}
