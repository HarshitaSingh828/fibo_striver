import java.util.*;
public class knightsfill {
    public static void main(String[]args){
    int[][] dir = { { 1, 2 }, { 1, -2 }, { -1, 2 }, { -1, -2 }, { 2, 1 }, { 2, -1 }, { -2, 1 }, { -2, -1 } };
   
    int[][] ans = new int[5][5];
    for(int[] ar : ans){
        Arrays.fill(ar, -1);
    }
    ans[0][0] = 0;
    boolean a =knightFill(ans, dir, 0, 0, 0);
    }
   public static boolean knightFill(int[][] ans, int[][] dir, int sr, int sc, int ct) {
            if (ct == 24) {
            for (int[] ar : ans) {
                for (int ele : ar) {
                    System.out.print(ele + " ");
                }
                System.out.println();
            }
            return true;
        }
       boolean res = false;
        for (int d = 0; d < dir.length; d++){
            int rc = dir[d][0];
            int cc = dir[d][1];
            int nr = sr + rc;
            int nc = sc + cc;
            if (nr >= 0 && nc >= 0 && nr < ans.length && nc < ans.length && ans[nr][nc] == -1) {
                ans[nr][nc] = ct + 1;
                res = res || knightFill(ans, dir, nr, nc, ct + 1);
                if (res) {
                    return true;
                }
                ans[nr][nc] = -1;
            }
        }
       return false;
    }
}

