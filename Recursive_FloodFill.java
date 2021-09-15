    void floodFill(int sr, int sc, int dr, int dc, int maze[][], boolean visited[][], int direction[][], 
    String directionStr[], String ans) {
        
        //Check if we have reached our destination
        if(sr==dr&&sc==dc) {
            System.out.println(ans);
            return 1;
        }
        
        //rows
        int m = visited.length;
        //columns
        int n = visited[0].length;
        
        //General Method
        /*
        
        1. Mark visited
        2. Travel paths
        3. Unmark visited

        */
        
        //Counting the paths at a level
        int count=0;
        
        visited[sr][sc]=true;
        
        //Loop on all possible direction in terms of a direction array        
        for(int i=0;i<direction.length;i++)
        {
          sr = sr + direction[i][0];
          sc = sc + direction[i][1];
          
          //Since left and down bhi jaa rhe hn, so we need to check for negative values also, along 
          //with ki matrix se bahar na chle jaayein and visited na kia ho
          if(sr>=0 && sc>=0 && sr<m && sc<n && !visited[sr][sc])
            count+=maze(sr+1,sc,dr,dc,maze, directionStr[i]+str);
        }
    
        
        visited[sr][sc]=false;
        
        return count;
        
    }
