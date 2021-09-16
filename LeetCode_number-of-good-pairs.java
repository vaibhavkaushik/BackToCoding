class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        int count[] = new int[101];
        int len = nums.length;
        int ans=0;
        
        for(int i=0;i<len;i++) {
            count[nums[i]]++;
        }
        
        for(int i=0;i<len;i++) {
           ans += count[nums[i]]-1;
           count[nums[i]]--; 
        }
        
        return ans;
        
    }
}
