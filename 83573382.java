//https://www.codechef.com/START71C/problems/SNAPCHAT
//28-12-22
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
		    int tstreak=0,streak=0;
		    int n=kk.nextInt();
		    int a[]=new int[n];
		    int b[]=new int[n];
		    for(int i=0;i<n;i++)
		    a[i]=kk.nextInt();
		    for(int i=0;i<n;i++)
		    b[i]=kk.nextInt();
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]>0&&b[i]>0)
		        {
		            streak++;
		            if(streak>tstreak)
		            tstreak=streak;
		        }
		        else
		        streak=0;
		        
		    }
		    System.out.println(tstreak);
		}
	}
}