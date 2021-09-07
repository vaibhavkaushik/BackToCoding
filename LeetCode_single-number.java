class Solution {
    public int singleNumber(int[] nums) {
        int single=0;
        int len = nums.length;
        for(int i=0;i<len;i++) {
            single^=nums[i];
        }
        return single;
    }
}
