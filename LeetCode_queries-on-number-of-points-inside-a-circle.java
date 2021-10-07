class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        
        int ans[] = new int[queries.length];
        int count = 0;
        for(int i=0;i<queries.length;i++) {
            count=0;
            for(int j=0;j<points.length;j++) {
                count += calculateInside(points[j][0], points[j][1], queries[i][0], queries[i][1], queries[i][2]);
                
            }
            ans[i] = count;
        }
        
        return ans;
    }
    
    int calculateInside(int x, int y, int a, int b, int r) {
        int equation = (x*x) + (y*y) - (2*x*a) - (2*y*b) + (a*a) + (b*b) - (r*r);
        return equation<=0?1:0;  
    }
}
