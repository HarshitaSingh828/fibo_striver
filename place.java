import java.util.*;
public class place{
    public static void main(String[] args){
    permute("aab","");
    }
public static void permute(String str, String ans){
if(str.length()==0){
    System.out.println(ans);
    return;
}    
boolean [] map = new boolean[26];
for(int i = 0; i < str.length();i++){
char ch = str.charAt(i);
if(map[ch-'a'] == false){f
    map[ch-'a'] = true;
    String ros = str.substring(0,i)+ str.substring(i+1);
    permute(ros,ans+str.charAt(i));
}

    }
   
}
}
