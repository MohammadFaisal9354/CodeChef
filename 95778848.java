//https://www.codechef.com/problems/FOODPLAN
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Faisal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner kk=new Scanner(System.in);
		int testcases=kk.nextInt();
		while(testcases-->0)
		{
		    double n=kk.nextInt();
		    n=n-(0.1*n);
		    double m=kk.nextInt();
		    if(n<m)
		    System.out.println("ONLINE");
		    else if(m<n)
		    System.out.println("DINING");
		    else
		    System.out.println("EITHER");
		}
	}
}s