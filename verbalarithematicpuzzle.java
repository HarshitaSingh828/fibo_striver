import java.util.*;
public class verbalarithematicpuzzle {
    public static void main(String[]arrgs){
     String s1 = "send";
     String s2 = "more";
     String s3 = "money";
     cryptohelper(s1,s2,s3);
    }
    public static void cryptohelper(String s1, String s2, String s3){
        StringBuilder sb = new StringBuilder();
        boolean [] map = new boolean[26];
        for(int i = 0; i < s1.length();i++){
            map[s1.charAt(i)-'a'] = true;
        }
        for(int i = 0; i < s2.length();i++){
            map[s2.charAt(i)-'a'] = true;
        }
        for(int i = 0; i < s3.length();i++){
            map[s3.charAt(i)-'a'] = true;
        }
        for(int i = 0;  i< map.length; i++){
            if(map[i] == true){
                sb.append((char)(i+'a'));
            }
        }
   int[] charMap = new int[26];
   char[] numMap = new char[10];
   Arrays.fill(charMap,-1);
   Arrays.fill(numMap,' ');
 boolean ans  =  cryptofinal(s1,s2,s3,sb.toString(),0,charMap,numMap);
    System.out.println(ans);    

    }
 public static booelan cryptofinal(String s1, String s2, String s3, String unique,int idx,int[] charMap, char[] numMap ){
     if(idx == unique.length()){
         int n1 = generateInt(s1,charMap);
         int n2 = generateInt(s2,charMap);
         int n3 = generateInt(s3,charMap);
         if(n1 + n2 == n3){
             return true;
         }
         return false;
     }
boolean res = false;
    char ch = unique.charAt(idx);
    for(int i = 0; i < 10; i++){
  if(numMap[i] == ' '){
      numMap[i] = ch;
      charMap[ch-'a']=idx;
 res = res ||  cryptofinal(s1, s2,s3,unique,idx+1,charMap,numMap);
      numMap[i] = ' ';
      charMap[ch-'a']=-1;
  }
    }
    return res;
 }
 public static int generateInt(String str, int[] map) {
    int ans = 0;
    for (int i = 0; i < str.length(); i++) {
        ans = ans * 10 + (map[str.charAt(i) - 'a']);
    }
    return ans;
}
}
