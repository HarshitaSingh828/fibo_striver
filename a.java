public class a {
    public static void main(String[] args){
        int[] coins = {2,3,5,7};
        infipermutation(coins,10,"");
    }

public static void infipermutation(int[] coins, int tar, String ans) {
    if (tar == 0) {
        System.out.println(ans);
    }
    for (int i = 0; i < coins.length; i++) {
        if (tar - coins[i] >= 0) {
            infipermutation(coins, tar - coins[i], ans + coins[i]);
        }
    }
}
}