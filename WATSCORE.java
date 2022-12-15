//https://www.codechef.com/problems/WATSCORE
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
		    int a[]=new int[12];
		    for(int i=0;i<n;i++)
		    {
		        int t=kk.nextInt();
		        int t2=kk.nextInt();
		        if(t<=8&&a[t]<t2)
		        {
		            a[t]=t2;
		        }
		        
		    }
		    long ans=0;
		    for(int i=0;i<=8;i++)
		    {
		        ans+=a[i];
		    }
		    System.out.println(ans);
		}
	}
}