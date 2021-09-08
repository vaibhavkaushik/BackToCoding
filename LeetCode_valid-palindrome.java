class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuffer useful = new StringBuffer();
        
        int len = s.length();
        for(int i=0;i<len;i++) {
            if((s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='a'&&s.charAt(i)<='z')) {
               useful.append(Character.toLowerCase(s.charAt(i))); 
            } else if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
                useful.append(s.charAt(i));
            }
        }
        
        int start=0;
        int end=useful.length()-1;
        System.out.println(useful);
        while(start<=end) {
            if(useful.charAt(start)!=useful.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }
    
}
