import java.util.*;
public class coinchangepermutation {
    public static void main(String[]args){   
int [] coins = {2,3,5,7};
boolean [] vis = new boolean[4];
    int ans= sinlgepermutation(coins, 10, "",vis);
    System.out.println(ans);
}
public static int sinlgepermutation(int[] coins, int tar, String ans , boolean[] vis){
 if(tar == 0){
    System.out.println(ans);
    return 1;
}
int count =0;
    for(int  i = 0; i < coins.length; i++){
     if(tar-coins[i]>= 0){
         if(vis[i] == false){
             vis[i] = true;
         count+=  sinlgepermutation(coins,tar-coins[i],ans+coins[i],vis);
             vis[i] = false;
         }
     }
}
return count;
}
}