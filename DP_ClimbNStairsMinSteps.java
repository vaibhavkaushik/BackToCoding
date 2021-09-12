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
     
     //if n==0 then we return 0, since we are at target, no jumps are required now
     if(n==0) {
         return 0;
     }
     
     //if we are in negative steps, we cannot go anywhere with any number of jumps
     if(n<0) {
         return Integer.MAX_VALUE;
     }
     
     //If we have already calculated the minimum steps for reaching this stair previously, then return that
     if(dp[n]>0) {
         return dp[n];
     }
     
     //This will store the minimum steps taken at a given level and given n.
     int ans=0;
     //As we need to keep track of minimum steps, we need this variable
     int minimum=Integer.MAX_VALUE;
     
     // Calculate the minimum jumps required if we take 1,2,3... n steps according to jump array, 
     // to reach the destination.
     // **** Note that climbing 3 steps, 2 steps, 1 steps is actually nothing but counted as 1 jump,as ek baar 
     // mein 3,2,1 kood rhe hain
     // jumps_available[jumps_available.length-n] is taken because we are starting from bottom to top
     // i.e When n=10, we have jumps_available[10-10] or jumps_available[0] choices, then we move to next step where n=9,         
     // and we have jumps_available[10-9] or jumps_available[1] choices.
     for(int i=1;i<=jumps_available[jumps_available.length-n];i++) {
         ans = stairsDP(n-i,dp,jumps_available);
         //Ye krna jaroori hai kyoonki infinty+1 negative value ho jaayegi and sb kharaab ho jaayega
         if(ans!=Integer.MAX_VALUE)
         minimum = Math.min(minimum,ans+1);
     }

     // Combine all the ways to reach
     dp[n] = minimum;
     
     return dp[n];
     
 }

}
