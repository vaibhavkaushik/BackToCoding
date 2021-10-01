class Solution {
    public String longestNiceSubstring(String s) {
        
        StringBuilder str = new StringBuilder(s);
        int len = s.length();
        
        String longest="";
        int maxLen = 0;
        
        for(int i=0;i<len;i++) {
            for(int j=i;j<len;j++) {
                String sub = str.substring(i,j+1);
                String ans = check(sub);
                if(ans.length() > longest.length()) {
                    longest = ans;
                }
            }
        }
        
        return longest;
    }
    
    public String check(String s) {
        
        int small[] = new int[26];
        int caps[] = new int[26];
        int len = s.length();
        int count=0;
        
        for(int i=0;i<len;i++) {
            
            if(s.charAt(i)>='a' && s.charAt(i)<='z') {
                small[s.charAt(i)-'a']++;
            }
            if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
                caps[s.charAt(i)-'A']++;
            }    
        }
        
        for(int i=0;i<26;i++) {
            
            if(small[i]!=0 && caps[i]!=0) {
                count++;
            } else if((small[i]==0 && caps[i] > 0)||(small[i] > 0 && caps[i] == 0)) {
                count=0;
                break;
            }
            
        }
        
        if(count > 0) {
            return s;
        } else {
            return "";
        }
    }
}
