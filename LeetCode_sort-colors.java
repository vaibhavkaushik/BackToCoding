class Solution {
    public void sortColors(int[] arr) {
        
        int i=0,j=0,k=arr.length -1;
        int len=arr.length;
        
        //  0000000   1111111   12012012    22222222
        //  0 to j-1  j to i-1  i to k      k+1 to e
        // Initially i and j are at 0 and k is at end.
        // 
            while(i<=k){
                
                // We checked arr[i] and we encountered 1,  this means we need to continue traversing ahead
                // as 1 is found in middle of partition and between j and i-1; So we increase i or decrease the                     // range by 1
                if(arr[i]==1) {
                    
                    i++;
                    
                } 
                // We checked arr[i] and we encountered 0,  this means we need to swap this 0 with the 
                // last index where we didn't see a 0 from left side.
                else if(arr[i]==0) {
                    
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
           
                    i++;
                    j++;

                }
                // We checked arr[i] and we encountered 2,  this means we need to swap this 2
                // with some number present at k position right now, and increase the region of 2s
                // or basically k-- since it starts from rightmost end. We don't do i++ since we are not
                // sure about the number at kth position before swapping.
                else {

                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                    
                    k--;

                }
            }
        
        
    }
}
