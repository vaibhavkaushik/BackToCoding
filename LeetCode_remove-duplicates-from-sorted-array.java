class Solution {
    public int removeDuplicates(int[] nums) {
        
        int len = nums.length;
        int index=1;
        for(int i=1;i<len;i++) {
            if(nums[i]!=nums[i-1]) {
                index+=1;
                nums[index-1]=nums[i];
            } 
        }
    
        return index;
    }
}
