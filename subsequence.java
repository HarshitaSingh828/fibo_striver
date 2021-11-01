import java.util.*;
public class subsequence {
   public static void main(String[]args){
     String str = "abc";
     getss1(str,"",0);
}
public static void getss1(String str, String ans, int idx){
if(idx == str.length()){
    System.out.println(ans);
    return;
}

    getss1(str, ans+str.charAt(idx), idx+1);
    getss1(str, ans, idx+1);
}
}