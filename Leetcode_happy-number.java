class Solution {
    public boolean isHappy(int n) {
        
        //The concept here is to store all the numbers which are not happy number. i.e they
        //are a part of cycle. As and when we reach upon a number, stored in our hashset,
        //this means the current number for which we are looping has encountered a number
        //which was previously a part of cycle.
        // In such cases we can totally ignore this number.
        HashSet<Integer> h = new HashSet<Integer>();
        
        int sum=0;
            
        //Till the time this current number is not 1
        while(n!=1) {
            
            //For every iteration of digit sums.
            while(n>0) {
             sum += (n%10)*(n%10);
             n/=10;
            }

            //If this number is part of prev. cycles, then current number is not a happy number
            if(h.contains(sum)) {
                return false;
            }
            
            //If this is a newly encountered number, then add it to list of visited cyclic number
            h.add(sum);
            n=sum;
            sum=0;
        }
        
        return true;
        
    }
}
