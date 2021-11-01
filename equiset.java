public class equiset {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        equiSet(arr);
    }
    public static void equiSet(int[] arr) {
         int ans = equiSet_(arr, 0, 0 , 0, "", "");// arr,idx,sum1,sum2,answer
        
        System.out.println(ans);
    }

    public static int equiSet_(int[] arr, int idx, int s1, int s2, String set1, String set2) {
        if (idx == arr.length) {
            if (s1 == s2) {
                System.out.println(set1.substring(0, set1.length() - 1) + " == " + set2.substring(0, set2.length() - 1));
                return 1;
            }
            return 0;
        }
        int ans = 0;
        ans += equiSet_(arr, idx + 1, s1 + arr[idx], s2, set1 + arr[idx] + "+", set2);
        ans += equiSet_(arr, idx + 1, s1, s2 + arr[idx], set1, set2 + arr[idx] + "+");
        return ans;
    }
}
