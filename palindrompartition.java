public class palindrompartition {
    public static void main (String[]args){
        palindromePartition("pepep");
    }
    public static void palindromePartition(String str) {
        int ans =  palindromePartition_(str, 0, "");
        System.out.println(ans);
    }

    public static int palindromePartition_(String str, int idx, String ans) {
        if (idx >= str.length()) {
            System.out.println(ans);
            return 1;
        }
        int count = 0;
        for (int cut = idx; cut < str.length(); cut++) {
            String palin = str.substring(idx, cut + 1);
            if (ispalin(palin)) {
                count += palindromePartition_(str, cut + 1, ans + "(" + palin + ")");
            }
        }
        return count;
    }

    public static boolean ispalin(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
