import java.util.*;

public class boardpath {
    public static void main(String[] args) {
        int n = 3;
  ArrayList<String> ans =    boardpath(n , 0);
  System.out.println(ans);
}
public static ArrayList<String> boardpath(int n , int idx){
    if (idx == n) {
        ArrayList<String> base = new ArrayList<>();
        base.add("");
        return base;
    }
ArrayList<String> ans = new ArrayList<>();
ArrayList<String>single =  boardpath(n, idx+1);
for(String s : single){
    ans.add("1" + s);
}
if(idx +2 <= n){
    ArrayList<String>doubl =  boardpath(n, idx+2);
    for(String s : doubl){
        ans.add("2" + s);
    } 
}

if(idx+3<=n){
    ArrayList<String>triple =  boardpath(n, idx+3);
    for(String s : triple){
        ans.add("3" + s);
    } 
}
return ans;
}
}
