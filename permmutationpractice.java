import java.util.*;
public class permutationpractice{
    public static void main(String[] args){
 ArrayList<String>  ans =    permute("abc",0);
 System.out.println(ans);
    }
    public static ArrayList<String> permute(String str, int idx){
if(idx == str.length()){
 ArrayList <String> base = new ArrayList<>();
    base.add("");
 return base;
}
    ArrayList<String> recans =  permute(str, idx+1);
     ArrayList<String> ans = new ArrayList<>();
     char ch = str.charAt(idx);
     for(String  s : recans){
         for(int i = 0; i < s.length();i++){
             String mstr = s.substring(0,i)+ch+ s.substring(i);
             ans.add(mstr);
     }
     }
     return ans; 
    }
}