import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    
    Scanner scn = new Scanner(System.in);
    int rows = scn.nextInt();
    int columns = scn.nextInt();
    
    // Maze containing all the cost
    int cost_matrix[][] = new int[rows][columns];
    
    // Matrix where we will store the min steps to reach m,n from a given i,j
    int result_matrix[][] = new int[rows][columns];
    
    for(int i=0;i<rows;i++) {
        for(int j=0;j<columns;j++) {
            cost_matrix[i][j] = scn.nextInt();
            // Initialize result matrix with -1
            result_matrix[i][j]=-1;
            
        }    
    }
    
    //The cost of reaching the destination from destination is equal to cost of standing there
    result_matrix[rows-1][columns-1] = cost_matrix[rows-1][columns-1];
    System.out.println(mazeDP(cost_matrix,0,0,result_matrix));
    
 }
 
 public static int mazeDP(int cost_matrix[][], int rows, int columns, int result_matrix[][]) {
     
    
    //If we have reached the destination
     if(rows==cost_matrix.length-1 && columns==cost_matrix[0].length-1) {
        
         return cost_matrix[cost_matrix.length-1][cost_matrix[0].length-1];
     }
     
     //If we are getting out of matrix, then the cost of reaching destination from there is infinity
     if(rows>=cost_matrix.length || columns>=cost_matrix[0].length) {
         return Integer.MAX_VALUE;
     }
     
     //If we have previously calculated the best path frm current position then directly return it
     if(result_matrix[rows][columns]!=-1) {
         return result_matrix[rows][columns];
     }
     
     //Move in horizontal and vertical direction
     int horizontal = mazeDP(cost_matrix,rows,columns+1,result_matrix); 
     int vertical = mazeDP(cost_matrix,rows+1,columns,result_matrix);
     
     if(horizontal!=Integer.MAX_VALUE||vertical!=Integer.MAX_VALUE)
     result_matrix[rows][columns] = cost_matrix[rows][columns] + Math.min(horizontal,vertical);
     
     return result_matrix[rows][columns];
     
 }

}
