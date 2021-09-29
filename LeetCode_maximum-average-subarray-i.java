class Solution {
    public double findMaxAverage(int[] arr, int k) {
     
        int length = arr.length;
        int sum = 0;

        //Storing the prefix sum of array
        int prefix_sum[] = new int[length];
        prefix_sum[0] = arr[0];
        for(int i=1;i<length;i++) {
            prefix_sum[i] = prefix_sum[i-1] + arr[i];
        }
        
        //Lets take the most -ve avg. we can take
        double max_avg = Integer.MIN_VALUE*1.0;
        
        //Initial Window length
        int window_len = k;
            //Start from end element of the window and keep sliding window to right
            for(int i=window_len;i<=length;i++) {
                
                //Keep track of the prev. n elements sum when we shift the window, in case we end
                //up in -ve indexes just give the result as 0 in such cases
                int prev_sum_before_window = (i-window_len-1) < 0  ? 0:prefix_sum[i-window_len-1];
                
                //To find the sum of elements in window, we can subtract the prefix sum at end of window
                //and prefix sum before the window
                max_avg = Math.max(max_avg,(double)(prefix_sum[i-1] - prev_sum_before_window)/k);
            }
        
        
       return max_avg;
        
    }
}
