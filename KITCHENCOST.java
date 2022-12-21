//https://www.codechef.com/START70C/problems/KITCHENCOST
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
		    int value=kk.nextInt();
		    int a[]=new int[n];
		    int b[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    a[i]=kk.nextInt();
		    for(int i=0;i<n;i++)
		    b[i]=kk.nextInt();
		    long ans=0;
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]>=value)
		        ans+=b[i];
		    }
		    System.out.println(ans);
		}
	}
}