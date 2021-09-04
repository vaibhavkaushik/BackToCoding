class Solution {
    public int lengthOfLastWord(String s) {
        
        int len = s.length();
        int first_index = len-1;
        
        for(int i=len-1;i>=0;i--) {
            if(s.charAt(i)==' ') {
                first_index--;
            } else {
                break;
            }
        }
        System.out.println(first_index);
        int count=0;
        for(int i=first_index;i>=0;i--) {
            if(s.charAt(i)==' ') {
                break;
                
            } else {
                count++;
            }
        }
        
        return count;
    }
}
