/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		increasingDecreasing(1,5);
	}
	
	private static void increasingDecreasing(int i, int n){
	    if(i == n + 1) return;
	    System.out.println(i);
	    increasingDecreasing(i + 1, n);
	    System.out.println(i);
	}
}


// Output
/*
1
2
3
4
5
5
4
3
2
1

*/
