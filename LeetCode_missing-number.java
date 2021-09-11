class Solution {
    public int missingNumber(int[] nums) {
        
        int total_nums = nums.length;
        int req_sum = (total_nums*(total_nums+1))/2;
        int len = nums.length;
        int arr_sum = 0;
        
        for(int i=0;i<len;i++) {
            arr_sum+=nums[i];
        }
        
    
        return req_sum-arr_sum;
        
    }
}
