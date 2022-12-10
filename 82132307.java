//https://www.codechef.com/problems/PALL01
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
		    int n=kk.nextInt();
		    int n2=0;
		    int i=n;
		    while(i>0)
		    {
		        int t=i%10;
		        n2=n2*10+t;
		        i/=10;
		    }
		    if(n==n2)
		    System.out.println("wins");
		    else
		    System.out.println("loses");
		}
	}
}