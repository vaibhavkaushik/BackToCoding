class Solution {
    public int[] minOperations(String boxes) {
        
        ArrayList<Integer> list = new ArrayList<>();
        int len = boxes.length();
        
        //Count 1s
        for(int i=0;i<len;i++) {
            if(boxes.charAt(i)-'0'==1) {
                list.add(i);
            }
        }
        
        int result[] = new int[len];
        int oneCount = list.size();
        
        //Cost of moving 1 to ith position is (position of 1 - current_idx)
        for(int i=0;i<len;i++) {
            
            int ans=0;
            for(int idx : list) {
            
            ans+=(Math.abs(idx-i));
            
            }
            result[i]=ans;
        }
        
        return result;
        
        
    }
}
