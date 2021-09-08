 public void merge(int[] nums1, int m, int[] nums2, int n) {
    
     //Pointer for the first array
     int pointer1 = m-1;
     //Pointer for the second array
     int pointer2 = n-1;
     //Total expected size combined array
     int size = (m + n) - 1;
     
    //  nums1 = 2 3 4(pointer1) 0 0 0(size)
    //  nums2 = 1 2 5(pointer2)
    //  We will start from last of nums2 array and keep moving left towards the start 
    while(pointer2 >=0 ){
        
        //We will start in nums1 from original length
        // Compare the last 2 parts of sorted array, ex. 4 and 5.
        // Place the higher at end and move left
        if(pointer1 >=0 && nums1[pointer1] > nums2[pointer2]){
            nums1[size--] = nums1[pointer1--];
        }
        // Place other greater element
        else{
            nums1[size--] = nums2[pointer2--];
        }
    }
