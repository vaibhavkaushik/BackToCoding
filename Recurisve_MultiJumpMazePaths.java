public static int printMazePathsMultiJumps(int sr, int sc, int dr, int dc, String psf) {
        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return 1;
        }

        int count = 0;
        //Travel in every possible horizontal direction
        for (int j = 1; sc + j <= dc; j++)
            count += printMazePathsMultiJumps(sr, sc + j, dr, dc, psf + "h" + j);
        //Travel in every possible diagonal direction
        for (int j = 1; sr + j <= dr && sc + j <= dc; j++)
            count += printMazePathsMultiJumps(sr + j, sc + j, dr, dc, psf + "d" + j);
        //Travel in every possible vertical direction
        for (int j = 1; sr + j <= dr; j++)
            count += printMazePathsMultiJumps(sr + j, sc, dr, dc, psf + "v" + j);

        return count;
}
