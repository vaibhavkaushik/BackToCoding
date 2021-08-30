class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int array_length = strs.length;
        int min_len = Integer.MAX_VALUE;
        
        for(int i=0;i<array_length;i++) {
            min_len = Math.min(min_len,strs[i].length());
        }
        
        int arr[] = new int[26];
        int index = 0;
        String answer = "";
        while(index!=min_len) {
            
            for(int i=0;i<array_length;i++) {
                
                String str = strs[i];
                arr[str.charAt(index)-'a']+=1;
                
            }
            if(arr[strs[0].charAt(index)-'a']==array_length) {
                answer += strs[0].charAt(index)+"";
                arr[strs[0].charAt(index)-'a']=0;
                index+=1;
            } else {
                break;
            }

        }
        
        return answer;
    }
}
