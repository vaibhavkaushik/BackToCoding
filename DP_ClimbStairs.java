import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    
    Scanner scn = new Scanner(System.in);
    int stairs = scn.nextInt();
    
    //Since we need to store the result for nth number also, we take n+1.
    int dp[] = new int[stairs+1];
   
    System.out.println( stairsDP(stairs,dp));
    
 }
 
 public static int stairsDP(int n, int dp[]) {
     
     //if n==0 then we return 1, since there is only 1 path from 0
     if(n==0) {
         return 1;
     }
     
     //if we are in negative steps, there is no way to reach 0
     if(n<0) {
         return 0;
     }
     
     //If we have already calculated the result for reaching this stair previously, then return that
     if(dp[n]>0) {
         return dp[n];
     }
     
     // Calculate the steps if we take 1,2 or 3 jump to reach the destination
     int ans1 = stairsDP(n-1,dp);
     int ans2 = stairsDP(n-2,dp);
     int ans3 = stairsDP(n-3,dp);
     
     // Combine all the ways to reach
     dp[n] = ans1+ans2+ans3;
     
     return dp[n];
     
 }

}
