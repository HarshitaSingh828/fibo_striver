public class goldminetwo {
    public static void main(String[] args) {
        int[][] mat = new int[5][5];
        goldMine2(mat);
    }

    public static void goldMine2(int[][] mat) {
        int ans = 0;
        int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {// i,j -> start
                if (mat[i][j] > 0) {
                    int cans = collectGoldWithGivenStart(mat, i, j, dir);
                    if (ans < cans) {
                        ans = cans;
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static int collectGoldWithGivenStart(int[][] mat, int r, int c, int[][] dir) {
        mat[r][c] = -mat[r][c];
        int ans = 0;
        for (int d = 0; d < dir.length; d++) {
            int nr = r + dir[d][0];
            int nc = c + dir[d][1];
            if (nr >= 0 && nc >= 0 && nr < mat.length && nc < mat[0].length && mat[nr][nc] > 0) {
                int rAns = collectGoldWithGivenStart(mat, nr, nc, dir);
                if (ans < rAns) {
                    ans = rAns;
                }
            }
        }
        mat[r][c] = -mat[r][c];
        return ans + mat[r][c];
    }
}