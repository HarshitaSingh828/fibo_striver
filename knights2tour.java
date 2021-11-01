import java.util.Arrays;

public class knights2tour {
     public static void main(String[] args) {
        int [][] dir ={{1,2},{1,-2},{-1,2},{-1,-2},{2,1},{2,-1},{-2,1},{-2,-1}};
        int [][] ans = new int [5][5];
        for(int [] arr : ans){
            Arrays.fill(arr,-1);
        }
        ans[0][0] = 0;
       boolean a = knightsfill(ans,dir,0,0,0);
    }
 public static boolean knightsfill(int[][] ans, int [][] dir, int sr, int sc, int ct){
if(ct == 24){
for(int[] arr : ans){
    for(int ele: arr){
        System.out.println(ele+" ");
    }
    System.out.println();
}

return true;
}
boolean res = false;
for(int i = 0; i < dir.length; i++){
    int rc = dir[i][0];
    int cc = dir[i][1];
    int nr = sr+rc;
    int nc = sc+cc;
    if(nr>=0&& nc>= 0&& nr <= ans.length&& nc <= ans.length && ans[nr][nc] ==-1){
        ans[nr][nc]=ct+1;
    res =res|| knightsfill(ans, dir, sr, sc, ct+1);
    if(res){
        return true;
    }
    ans[nr][nc]=-1;
    }
}
return false;

    }
}
