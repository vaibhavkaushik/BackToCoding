class Solution{
// Kadane's Algorithm -- Dynamic Programming
    // The algorithm requires keeping track of the largest sum found
    // in addition to the current sum.
    // Starting at the leftmost index, compare the current sum with the
    // value at the current index, and determine whether combining them together
    // is better or worse than simply keeping the new value.
    // If the combination of the sum and value is > the value itself, combine them.
    // Otherwise, drop the previous sum, and replace it with the new value instead.
    //
    // The logic behind this is that when the value at the index is greater
    // than the current sum + that value, that means keeping the current sum would
    // reduce the overall value as opposed to just keeping the new number.
    //
    // [5,4,-1,7,8]
    // localMax = 0, globalMax = -MAX_VALUE
    // i = 0, localMax = 5  (nums[0] and nums[0] + 0 both give 5),  globalMax = 5
    // i = 1, localMax = 9  (nums[1] + localMax), globalMax = 9
    // i = 2, localMax = 8  (nums[2] + localMax), globalMax = 9
    // i = 3, localMax = 15 (nums[3] + localMax), globalMax = 15
    // i = 4, localMax = 23 (nums[4] + localMax), globalMax = 23
    //
    // [-2,1,-3,4,-1,2,1,-5,4]
    // localMax = 0,  globalMax = -MAX_VALUE
    // i = 0, localMax = -2 (nums[0] + localMax), globalMax = -2
    // i = 1, localMax = 1  (nums[1]),            globalMax = 1
    // i = 2, localMax = -2 (nums[2] + localMax), globalMax = 1
    // i = 3, localMax = 4  (nums[3]),            globalMax = 4
    // i = 4, localMax = 3  (nums[4] + localMax), globalMax = 4
    // i = 5, localMax = 5  (nums[5] + localMax), globalMax = 5
    // i = 6, localMax = 6  (nums[6] + localMax), globalMax = 6
    // i = 7, localMax = 1  (nums[7] + localMax), globalMax = 6
    // i = 8, localMax = 4  (nums[8]),            globalMax = 6
    public int maxSubArray(int[] nums) {

        // localMax tracks the current window sum
        int localMax = 0;
        // globalMax tracks the largest sum found so far
        int globalMax = Integer.MIN_VALUE;

        // iterate over the entire array once, calculating the sums
        for(int i = 0; i < nums.length; i++){
            // if the value in the array is larger than the currently known localMax
            // replace the max with that value. Otherwise just add the value
            // the decision to replace the localMax is done because the preceeding
            // values will always drag the new value down instead of adding to it,
            // therefore they are dropped.
            localMax = Math.max(nums[i], nums[i] + localMax);
            // if the local max is larger than the globalMax after adding or
            // replacing with the current index, replace the globalMax
            // this ensures that the largest sum found is kept, regardless of
            // updates to localMax
            globalMax = localMax > globalMax ? localMax : globalMax;
        }

        return globalMax;
    }
}
