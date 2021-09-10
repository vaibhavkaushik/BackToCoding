import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    
    Scanner scn = new Scanner(System.in);
    int stairs = scn.nextInt();
    
    int jumps_available[] = new int[stairs];
    
    //Store available jumps for each step in array 
    for(int i=0;i<stairs;i++) {
        jumps_available[i] = scn.nextInt();
    }
    
    //Since we need to store the result for nth number also, we take n+1.
    int dp[] = new int[stairs+1];
   
    System.out.println(stairsDP(stairs,dp,jumps_available));
    
 }
 
 public static int stairsDP(int n, int dp[], int jumps_available[]) {
     
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
     
     //This will store the total steps taken at a given level and given n.
     int ans=0;
     // Calculate the steps if we take 1,2,3... n jumps according to jump array, to reach the destination
     // jumps_available[jumps_available.length-n] is taken because we are starting from bottom to top
     // i.e When n=10, we have jumps_available[10-10] or jumps_available[0] choices, then we move to next step where n=9, 
     // and we have jumps_available[10-9] or jumps_available[1] choices.
     for(int i=1;i<=jumps_available[jumps_available.length-n];i++) {
         ans+=stairsDP(n-i,dp,jumps_available);
     }
     
     // Combine all the ways to reach
     dp[n] = ans;
     
     return dp[n];
     
 }

}
