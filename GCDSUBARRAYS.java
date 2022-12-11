//https://www.codechef.com/DEC221C/problems/GCDSUBARRAYS
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner kk=new Scanner(System.in);
		int testcases=kk.nextInt();
		while(testcases-->0)
		{
		    long s;
		    long n=kk.nextLong();
		    long k=kk.nextLong();
		    if((n*(n-1))>k)
		    System.out.println(-1);
		    else
		    {
		       s=(n*(n+1)/2)-1;
		       for(int i=0;i<n-1;i++)
		       System.out.print(1+" ");
		       System.out.println(k-s);
		    }
		    
		}
	}
}