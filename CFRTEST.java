//https://www.codechef.com/problems/CFRTEST
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
		    int a[]=new int[101];
		    int count=0;
		    for(int i=0;i<n;i++)
		    a[kk.nextInt()]++;
		    for(int i=1;i<101;i++)
		    {
		        if(a[i]>0)
		        count++;
		    }
		    System.out.println(count);
		}
	}
}