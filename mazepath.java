import java.util.*;
public class mazepath {
    public static void main(String[] args) {
        // mazePath(0, 0, 2, 2, "");
        ArrayList<String> ans = mazePath(0, 0, 2, 2);
        System.out.println(ans);
    }

    // public static void mazePath(int sr, int sc, int dr, int dc, String ans) {
    // if (sr == dr && sc == dc) {
    // System.out.println(ans);
    // return;
    // }
    // if (sr > dr || sc > dc) {
    // return;
    // }
    // mazePath(sr + 1, sc, dr, dc, ans + "V");
    // mazePath(sr, sc + 1, dr, dc, ans + "H");

    // }
    public static ArrayList<String> mazePath(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (sr + 1 <= dr) {

            ArrayList<String> vcall = mazePath(sr + 1, sc, dr, dc);
            for (String val : vcall) {
                ans.add("V" + val);
            }
        }
        if (sc + 1 <= dc) {

            ArrayList<String> hcall = mazePath(sr, sc + 1, dr, dc);
            for (String val : hcall) {
                ans.add("H" + val);
            }
        }
        return ans;
    }

}
