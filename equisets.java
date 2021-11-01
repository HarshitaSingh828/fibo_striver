public class equisets {
    public static void main(String[]args){
        solve();
    }
    public static void solve(){
        int [] arr = {10,20,30,40};
        equiset(arr);
    }
    public static void equiset(int []arr){
        int ans = equiset_(arr,0,0,0,"","");
        System.out.println(ans);
    }
    public static int equiset_(int [] arr, int idx, int s1, int s2 , String set1,String set2){
if(idx == arr.length){
    if(s1 == s2){
        System.out.println(set1.substring(0, set1.length()-1)+ set2.substring(0,set2.length()-1));
    }
}
int ans = 0;
     ans+=   equiset_(arr,idx+1,s1+arr[idx],s2,set1+arr[idx]+"+",set2);
     ans+=   equiset_(arr, idx+1,s1,s2+arr[idx],set1,set2+arr[idx]+"+");
        return ans;
    }
}
