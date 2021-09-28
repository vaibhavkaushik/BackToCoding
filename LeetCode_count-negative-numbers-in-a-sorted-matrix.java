class Solution {
    public int countNegatives(int[][] grid) {
        
        int count = 0;
        for(int row[] : grid) {
            int idx = 0;
            for(int num : row)  {
                if(num<0) {
                    count+=grid[0].length - idx;
                    break;
                } 
                idx++;
            }
        }
        return count;
    }
}
