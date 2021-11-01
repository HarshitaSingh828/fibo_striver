public class friendspairing {
    public static void main(String[]args){
        friendsPairing(4);
    }
    public static void friendsPairing(int n) {
        boolean[] used = new boolean[n + 1];
        int ans = friendsPairing(n, used, 1, "");
        System.out.println(ans);
    }

    public static int friendsPairing(int n, boolean[] used, int num, String ans) {
        if (num > n) {
            System.out.println(ans);
            return 1;
        }
        int count = 0;
        if (used[num] == false) {
            used[num] = true;
            count += friendsPairing(n, used, num + 1, ans + "(" + num + ")");

            for (int pu = num + 1; pu <= n; pu++) {
                if (used[pu] == false) {
                    used[pu] = true;
                    count += friendsPairing(n, used, num + 1, ans + "(" + num + "" + pu + ")");
                    used[pu] = false;
                }
            }
            used[num] = false;
        } else {
            count += friendsPairing(n, used, num + 1, ans);
        }
        return count;
    } 
}
