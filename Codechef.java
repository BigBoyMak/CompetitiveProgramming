/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
    // StringTokenizer st = new StringTokenizer(br.readLine()); 
    // int n = Integer.parseInt(st.nextToken()); 
    // int k = Integer.parseInt(st.nextToken()); 
  
    int t = Integer.parseInt(br.readLine()); 
    long[] arr = new long[t];
		for(int i=0; i<t; i++){
		    long n = Long.parseLong(br.readLine());
		    arr[i] = n;
		}
		
		for(long n: arr){
		    long out = 1L + ((n-2) * (n-1));
		    System.out.println(out);
		}
	}
}
