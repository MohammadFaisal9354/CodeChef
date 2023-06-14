//https://www.codechef.com/problems/DIET
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
		    int p=kk.nextInt();
		    int ans=0;
		    int rem=0;
		    for(int i=0;i<n;i++)
		    {
		        int t=kk.nextInt()+rem;
		        if(t<p&&ans==0)
		        ans=i+1;
		        else if(t>=p)
		        {
		        rem=t-p;
		        
		        }
		        
		    }
		    if(ans==0)
		    System.out.println("YES");
		    else
		    System.out.println("NO "+ans);
		}
	}
}
