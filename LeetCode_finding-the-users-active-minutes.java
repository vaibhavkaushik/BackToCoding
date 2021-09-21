class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        
        HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
        int min_id = Integer.MAX_VALUE;
        for(int i=0;i<logs.length;i++)
        {
            for(int j=0;j<1;j++)
            {
                if(map.containsKey(logs[i][j]))
                {   HashSet<Integer> storage = map.get(logs[i][j]);
                    storage.add(logs[i][j+1]);
                    map.put(logs[i][j],storage);  
                } else{
                    min_id = Math.min(min_id,logs[i][j]);
                    HashSet<Integer> set = new HashSet<>();
                    set.add(logs[i][j+1]);
                    map.put(logs[i][j],set);
                    
                } 

            }  
        }
        
        int arr[] = new int[k];
        
         for (Map.Entry<Integer, HashSet<Integer>> entry : map.entrySet()) {
                 
                    arr[entry.getValue().size()-1]++;
        }
        
        return arr;
    }
}
