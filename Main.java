import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {
    //  ArrayList<String> ans = boardPath_(5, 0);
    //  System.out.println(ans);
    // mazePath(0, 0, 2, 2, "");

    // ArrayList<String> ans = mazePath_(0, 0, 2, 2);
    // System.out.println(ans);
    // floodFill(0, 0, 2, 2, "", new boolean[3][3]);
  
    // public static ArrayList<String> boardPath_(int n, int st) {
    //     if (st == n) {
    //         ArrayList<String> base = new ArrayList<>();
    //         base.add("");
    //         return base;
    //     }
    //     ArrayList<String> ans = new ArrayList<>();
    //     ArrayList<String> single = boardPath_(n, st + 1);
    //     for (String s : single) {
    //         ans.add("1" + s);
    //     }
    //     if (st + 2 <= n) {
    //         ArrayList<String> doubl = boardPath_(n, st + 2);
    //         for (String s : doubl) {
    //             ans.add("2" + s);
    //         }
    //     }
    //     if (st + 3 <= n) {
    //         ArrayList<String> triple = boardPath_(n, st + 3);
    //         for (String s : triple) {
    //             ans.add("3" + s);
    //         }
    //     }
    //     return ans;
    // }
    
    // public static void mazePath(int sr, int sc, int er, int ec, String ans) {
    //     if (sr == er & sc == ec) {
    //         System.out.println(ans);
    //         return;
    //     }
    //     if (sr + 1 <= er)
    //         mazePath(sr + 1, sc, er, ec, ans + "V");
    //     if (sc + 1 <= ec)
    //         mazePath(sr, sc + 1, er, ec, ans + "H");

    // }
    // public static ArrayList<String> mazePath_(int sr, int sc, int er, int ec) {
    //     if (sr == er && sc == ec) {
    //         ArrayList<String> base = new ArrayList<>();
    //         base.add("");
    //         return base;
    //     }
    //     ArrayList<String> ans = new ArrayList<>();
    //     if (sr + 1 <= er) {
    //         ArrayList<String> vcall = mazePath_(sr + 1, sc, er, ec);
    //         for (String s : vcall) {
    //             ans.add("V" + s);
    //         }
    //     }
    //     if (sc + 1 <= ec) {
    //         ArrayList<String> hcall = mazePath_(sr, sc + 1, er, ec);
    //         for (String s : hcall) {
    //             ans.add("H" + s);
    //         }
    //     }
    //     return ans;
    // }
    // public static void floodFill(int sr, int sc, int er, int ec, String ans, boolean[][] vis) {
    //     if (sr == er & sc == ec) {
    //         System.out.println(ans);
    //         return;
    //     }
    //     if (sr + 1 <= er && vis[sr + 1][sc] == false) {
    //         vis[sr + 1][sc] = true;
    //         floodFill(sr + 1, sc, er, ec, ans + "D", vis);
    //         // vis[sr + 1][sc] = false;

    //     }
    //     if (sc + 1 <= ec && vis[sr][sc + 1] == false) {
    //         vis[sr][sc + 1] = true;
    //         floodFill(sr, sc + 1, er, ec, ans + "R", vis);
    //         // vis[sr][sc + 1] = false;
    //     }
    //     if (sr - 1 >= 0 && vis[sr - 1][sc] == false) {
    //         vis[sr - 1][sc] = true;
    //         floodFill(sr - 1, sc, er, ec, ans + "U", vis);
    //         // vis[sr - 1][sc] = false;

    //     }
    //     if (sc - 1 >= 0 && vis[sr][sc - 1] == false) {
    //         vis[sr][sc - 1] = true;
    //         floodFill(sr, sc - 1, er, ec, ans + "L", vis);
    //         // vis[sr][sc - 1] = false;
            

    //     }

    // }
    int[][] dir = { { 0, 1 }, { 0, -1 }, { -1, 0 }, { -1, -1 }, { 1, 1 }, { -1, 1}, { 1, 0 }, { 1, 1 } };
    }
    public static void floodFillightCall(int sr, int sc, int er, int ec, String ans, boolean[][] vis, int[][] dir) {
        if (sr == er & sc == ec) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < dir.length; i++) {
            int rc = dir[i][0];
            int cc = dir[i][1];
            int nr = sr + rc;
            int nc = sc + cc;
            if (nr >= 0 && nc >= 0 && nr <= er && nc <= ec && vis[nr][nc] == false) {
                vis[nr][nc] = true;
                floodFillightCall(nr, nc, er, ec, ans, vis, dir);
                vis[nr][nc] = false;
            }
        }
        
    }
}