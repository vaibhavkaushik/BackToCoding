import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    
    Scanner scn = new Scanner(System.in);
    int fib_upto = scn.nextInt();
    
    //Since we need to store the result for nth number also, that' why we take n+1.
    int dp[] = new int[fib_upto+1];
   
    System.out.println( fibDP(fib_upto,dp));
    
 }
 
 public static int fibDP(int n, int dp[]) {
     
     //if n==0 then we return 0, if n==1 then we return 1
     if(n==0||n==1) {
         return n;
     }
     
     //If we have already calculated the result for current prev. then return that
     if(dp[n]>0) {
         return dp[n];
     }
     
     // Calculate the fib steps for fib(n)=fib(n-1)+fib(n-2);
     int fib1 = fibDP(n-1,dp);
     int fib2 = fibDP(n-2,dp);
     
     // Perform addition of two branches fib(n-1) and fib(n-2)
     dp[n] = fib1+fib2;
     
     return dp[n];
     
 }

}
