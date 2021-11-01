import java.util.*;
public class floodfilleightcalls {
    public static void main(String[]args){
        int[][] dir = { { 0, 1 }, { 0, -1 }, { -1, 0 }, { -1, -1 }, { 1, 1 }, { -1, 1 }, { 1, 0 }, { 1, 1 } };
        floodFillEightcalls(0, 0, 2, 2, "", new boolean[3][3],dir);
        
    }
    public static void floodFillEightcalls(int sr, int sc, int er, int ec, String ans, boolean[][] vis,int[][]dir) {
        if(sr == er && sc == ec){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i < dir.length; i++){
            int rc = dir[i][0];
            int cc = dir[i][1];
            int nr = sr + rc;
            int nc = sc + cc;
            if(nr >=0 && nc >=0 && nr <= er && nc <= ec && vis[nr][nc]== false){
                vis[nr][nc] = true;
                floodFillEightcalls(nr, nc, er, ec, ans, vis, dir);
                vis[nr][nc] = true;
            }
        }
    }
}
