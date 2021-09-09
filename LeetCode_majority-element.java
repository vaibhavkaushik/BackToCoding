class Solution {
    
    //Boyer-Moore voting algorithm
    public int majorityElement(int[] nums) {
        
        // First element toh 1 baar aayega hi
        int count=1;
        // Index of current majority element, maan k chlengay ki wo first element h
        int current_majority=0;
        
        // Since we took the first element as majority, we start from i=1
        for(int i=1;i<nums.length;i++) {
            
            // If currently visited element is equal to our majority element, then we increase the vote
            if(nums[i]==nums[current_majority]) {
                count++;
            } 
            // If this is not equal to our current majority element, we decrease the vote
            else {
                count--;
            }
            
            // If all the votes of currently assumed majority elements are exhausted
            // We need to change our current majority element
            if(count==0) {
                current_majority=i;
                count=1;
            }
            
        }
        
        int majority_count=0;
        
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==nums[current_majority]) {
                majority_count++;
            }
        }
        
        if(majority_count>=nums.length/2) {
            return nums[current_majority];
        }
        
         return nums[current_majority];
    }
}
