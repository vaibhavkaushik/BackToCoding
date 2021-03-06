class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int left = 0;
        int found=0;
        int right = nums.length-1;
        int mid = left + (right-left)/2;
        
        while(left<=right) {
            
            if(nums[mid]==target) {
                return mid;
            }
            
            if(target>nums[mid]) {
                left=mid+1;
            }
            if(target<nums[mid]) {
                right=mid-1;
            }
            
           mid = left + (right-left)/2;
        }
        
        return left;
        
    }
}
