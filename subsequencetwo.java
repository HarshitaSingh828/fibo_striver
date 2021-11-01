import java.util.*;
public class subsequencetwo {
   public static void main(String[]args){
    //    subsequence("aab","",true,0);
    ArrayList<String> ans = permutation1_("aab", 0);
    System.out.println(ans);
   }

//    public static void subsequence(String str, String ans, boolean coming, int idx){
//        if(idx == str.length()){
//            System.out.println(ans);
//            return;
//        }
//        if(coming){
//         subsequence(str,ans+str.charAt(idx),true,idx+1);
//         subsequence(str,ans,false,idx+1);
//        }
//        else{
//            char ch = str.charAt(idx);
//            if(ch == str.charAt(idx-1)){
//             subsequence(str,ans,false,idx+1); 
//            }
//            else{
//             subsequence(str,ans+str.charAt(idx),true,idx+1);
//             subsequence(str,ans,false,idx+1); 
//            }
//        }
//    }
public static ArrayList<String> permutation1_(String str, int idx) {
    if (idx == str.length()) {
        ArrayList<String> base = new ArrayList<>();
        base.add("");
        return base;
    }
    ArrayList<String> recAns = permutation1_(str, idx + 1);
    ArrayList<String> ans = new ArrayList<>();
    char ch = str.charAt(idx);
    for (String s : recAns) {
        for (int i = 0; i <= s.length(); i++) {
            String mstr = s.substring(0, i) + ch + s.substring(i);
            ans.add(mstr);
        }
    }
    return ans;
}
}
