class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        
        for(int i=0;i<numRows;i++) {
            int initial=1;
            List<Integer> inner_list = new ArrayList<>();
            for(int j=0;j<=i;j++) {
                inner_list.add(initial);
                initial = (initial*(i-j))/(j+1);
                
            }
            list.add(inner_list);
        }
        return list;
    }
}
