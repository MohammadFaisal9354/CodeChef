//https://www.codechef.com/START71C/problems/PETSTORE
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
		    int h[]=new int[101];
		    int n=kk.nextInt();
		    //int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    h[kk.nextInt()]++;
		    if(n%2!=0)
		    {
		        System.out.println("NO");
		        continue;
		    }
		    else{
		        boolean ans=true;
		       for(int i=0;i<101;i++)
		       {
		           if(h[i]%2!=0){
		               ans=false;
		               break;
		           }
		           
		           
		       }
		       if(ans)
		       System.out.println("YES");
		       else
		       System.out.println("NO");
		    }
		    
		}
	}
}