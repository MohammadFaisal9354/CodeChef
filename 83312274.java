//https://www.codechef.com/problems/AVGFLEX
//25-12-22
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
		    for(int i=0;i<n;i++)
		    a[i]=kk.nextInt();
		    Arrays.sort(a);
		    int ans=0;
		    int mid=a[n/2];
	        for(int i=0;i<n;i++){
	        if(a[i]>=mid)
	        ans++;
	    }
		    System.out.println(ans);
		}
	}
}