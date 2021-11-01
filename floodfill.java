import java.util.*;

public class floodfill {
    public static void main(String[]args){
        
        floodFill(0, 0, 2, 2, "", new boolean[3][3]);
    }

    public static void floodFill(int sr, int sc, int er, int ec, String ans, boolean[][] vis) {
        if (sr == er & sc == ec) {
            System.out.println(ans);
            return;
        }
        if (sr + 1 <= er && vis[sr + 1][sc] == false) {
            vis[sr + 1][sc] = true;
            floodFill(sr + 1, sc, er, ec, ans + "D", vis);
            vis[sr + 1][sc] = false;

        }
        if (sc + 1 <= ec && vis[sr][sc + 1] == false) {
            vis[sr][sc + 1] = true;
            floodFill(sr, sc + 1, er, ec, ans + "R", vis);
            vis[sr][sc + 1] = false;
        }
        if (sr - 1 >= 0 && vis[sr - 1][sc] == false) {
            vis[sr - 1][sc] = true;
            floodFill(sr - 1, sc, er, ec, ans + "U", vis);
            vis[sr - 1][sc] = false;

        }
        if (sc - 1 >= 0 && vis[sr][sc - 1] == false) {
            vis[sr][sc - 1] = true;
            floodFill(sr, sc - 1, er, ec, ans + "L", vis);
            vis[sr][sc - 1] = false;
            

        }

    }


    

}
