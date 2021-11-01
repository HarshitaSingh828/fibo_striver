public class b {
    public static void main(String[]args){
        int[] coins = { 2, 3, 5, 7 };
        int ans = infipermutation1(coins, 10, "");
        // int ans=infipcombination(coins, 10, 0, "");
        System.out.println(ans);
    }
    // public static int infipermutation(int[] coins, int tar, String ans) {
    //     if (tar == 0) {
    //         System.out.println(ans);
    //         return 1;
    //     }
    //     int count = 0;
    //     for (int i = 0; i < coins.length; i++) {
    //         if (tar - coins[i] >= 0) {
    //             count += infipermutation(coins, tar - coins[i], ans + coins[i]);
    //         }
    //     }
    //     return count;
    // }
    public static int infipermutation1(int[] coins, int tar,int idx, String ans) {
            if (tar == 0) {
                System.out.println(ans);
                return 1;
            }
            int count = 0;
            for (int i = idx; i < coins.length; i++) {
                if (tar - coins[i] >= 0) {
                    count += infipermutation(coins, tar - coins[i], i, ans + coins[i]);
                }
            }
            return count;
        }
}
