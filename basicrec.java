import java.util.*;
public class basicrec {
    public static void main(String[] args){
        int n = 5;
       // printinc(n);
       //printdec(n);
       printincdec(n);
    }
    // public static void printinc(int n ){
    //  if(n == 0){
    //      return;
    //  }
    //    printinc(n-1);
    //     System.out.println(n);
    
    // }
    // public static void printdec(int n ){
    //     if(n == 0){
    //         return;
    //     }
        
    //        System.out.println(n);
    //        printdec(n-1);
    //    }
    public static void printincdec(int n ){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printincdec(n-1);
        System.out.println(n);

       }
   
   
    
}
