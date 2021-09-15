void printMazePaths(int sr, int sc, int dr, int dc, int maze[][], String str) {
        
        //Check if we have reached our destination
        if(sr==dr&&sc==dc) {
            System.out.println(str);
            return 1;
        }
        
        //Counting the paths at a level
        int count=0;
        
        //Check whether we can reach this node in if condition only so as to avoid an -ve base case check
        if(sr+1<=dr)
        count+=maze(sr+1,sc,dr,dc,maze,"R"+str);
        
        //Check whether we can reach this node in if condition only so as to avoid an -ve base case check
        if(sr+1<=dr && sc+1<=dc)
        count+=maze(sr+1,sc+1,dr,dc,maze,"D"+str);
        
        //Check whether we can reach this node in if condition only so as to avoid an -ve base case check
        if(sc+1<=dc)
        count+=maze(sr,sc+1,dr,dc,maze,"V"+str);
        
        return count;
        
    }
