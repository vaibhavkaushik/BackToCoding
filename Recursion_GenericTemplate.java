	public static void main (String[] args) throws java.lang.Exception
	{
		mazePath();
	}
	
	public static int mazePath_HVD_2(int sr, int sc, int er, int ec, int[][] dir, String[] dirS, ArrayList<String> ans,
            String psf) {
        if (sr == er && sc == ec) {
            ans.add(psf);
            return 1;
        }

        int count = 0;
        for (int d = 0; d < dir.length; d++) {
            int x = sr + dir[d][0];
            int y = sc + dir[d][1];

            if (x >= 0 && y >= 0 && x <= er && y <= ec)
                count += mazePath_HVD_2(x, y, er, ec, dir, dirS, ans, psf + dirS[d]);
        }

        return count;
    }
    
    
    public static ArrayList<String> mazePath_HVD_3(int sr, int sc, int er, int ec, int[][] dir, String[] dirS) {
        if (sr == er && sc == ec) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        int count = 0;
        ArrayList<String> ans = new ArrayList<>();
        for (int d = 0; d < dir.length; d++) {
            int x = sr + dir[d][0];
            int y = sc + dir[d][1];

            if (x >= 0 && y >= 0 && x <= er && y <= ec) {
                ArrayList<String> rec = mazePath_HVD_3(x, y, er, ec, dir, dirS);
                for(String str :rec) {
                	ans.add(str+dirS[d]);
                }
            }
        }

        return ans;
    }
	
	public static void mazePath() {
        int sr = 0, sc = 0, er = 2, ec = 2;
        ArrayList<String> ans = new ArrayList<>();

        int[][] dir = { { 1, 0 }, { 0, 1 }, { 1, 1 }};
        String[] dirS = { "V", "H", "D" };

        System.out.println(mazePath_HVD_2(sr, sc, er, ec,dir,dirS,ans,""));
        System.out.println(mazePath_HVD_3(sr, sc, er, ec, dir, dirS));
		    System.out.println(ans);
    }

/*

13
[HHVV, HVHV, VHHV, DHV, HDV, HVVH, VHVH, DVH, VVHH, VDH, HVD, VHD, DD]
[VVHH, VHVH, VHHV, VHD, VDH, HVVH, HVHV, HVD, HHVV, HDV, DVH, DHV, DD]

*/
