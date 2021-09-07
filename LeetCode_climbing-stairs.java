class Solution {
    int counter=0;
    public int climbStairs(int n) {
        int arr[] = new int[n];
        return helper(n,arr);
    }
    
    int helper(int num, int arr[]) {
        
        if(num==0) {
            arr[num]=1;
            return 1;   
        }
        
        if(num<0) {
            return 0;
        }
        
        if(arr[num-1]>0) return arr[num-1];
        
        int path1 = helper(num-1,arr);
        int path2 = helper(num-2,arr);
        
        //System.out.println(path1+path2);
        arr[num-1]=path1+path2;
        
        return arr[num-1];
    }
}
