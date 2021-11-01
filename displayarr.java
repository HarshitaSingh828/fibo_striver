public class displayarr {
    public static void main(String[]args){
        int n = 5;
        int [] arr= {1,2,3,4,5};
        
        displayarr(arr,0);
    }
    public static void displayarr(int[]arr, int idx){
       if(idx == arr.length){
           return;
       }
        displayarr(arr, idx+1);
        System.out.println(arr[idx]);
    }
}
