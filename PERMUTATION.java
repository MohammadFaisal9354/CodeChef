//https://www.codechef.com/problems/PERMUTATION
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
		    int a[]=new int[n];
		    boolean ans=true;
		    for(int i=0;i<n;i++)
		    {
		        a[i]=kk.nextInt();
		        
		        if(a[i]>n)
		        ans=false;
		        
		    }
		    int jawab=0;
		       Arrays.sort(a);
		       for(int i=0;i<n;i++)
		       {
		           if(a[i]>i+1)
		           {
		               ans=false;
		               break;
		           }
		           else
		           jawab+=(i+1)-a[i];
		           
		           
		       }
		    if(ans)
		    {
		       System.out.println(jawab); 
		    }
		    else
		    System.out.println(-1);
		}
	}
}