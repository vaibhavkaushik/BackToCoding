class Solution {
    public int[] sortedSquares(int[] nums) {
     
        int left=0,right=nums.length-1;
        int arr[] = new int[nums.length];
        int k = nums.length-1;
        
        while(left<=right) {
            
            //  -4 -1 0 3 10
            //  16 1 0 9 100
            //  16 1 0 9 100 (this is fixed now), now shift right pointer backwards, push this sorted element to end of new array
            //  Compare 16 and 9
            //  Push 16 to end of new array and increase left pointer
            //
            if(nums[left]*nums[left] < nums[right]*nums[right]) {
               
                arr[k--] = Math.max(nums[left]*nums[left],nums[right]*nums[right]);
                right--;
                
            } 
            //  
            else {
                arr[k--] = Math.max(nums[left]*nums[left],nums[right]*nums[right]);
                left++;
            }
        }
        
        return arr;
    }
}
