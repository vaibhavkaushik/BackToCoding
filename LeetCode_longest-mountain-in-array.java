class Solution {
    public int longestMountain(int[] arr) {
     
        if(arr.length<3) return 0;
        
        int len = arr.length-1;
        int index = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        
      // Until we traverse all the elements
        while(index!=len) {
            
            // Since for every new occurence of a new mountain sequence we need to start the counter again
            int counter=0;
            // Left side of mountain sequence encountered
            if(arr[index]<arr[index+1]) {
                
                // We are climbing mountain from left side
                while(arr[index]<arr[index+1]) {
                    counter++;
                    index++;
                }
                // This means we have climbed till top and now the right side path starts
                while(arr[index]>arr[index+1]) {
                    counter++;
                    index++;
                }
                // If we again encounter a new start then we should store the total path length till now
                arr.add(counter);
            } else {
                // If we are not starting with a new left side keep travelling until a new mountain starts
                index++;
            }
            
        }
        
        int max = 0;
        if(list.size()>0) {
           max = Collections.max(list);
        }
        
        return max==0?0:max+1;
        
    }
}
