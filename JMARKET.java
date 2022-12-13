//https://www.codechef.com/problems/JMARKET
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
		    int x=kk.nextInt();
		    int[] a=new int[3];
		    for(int i=0;i<3;i++)
		    a[i]=kk.nextInt();
		    Arrays.sort(a);
		    System.out.println((a[0]*(x-1))+a[1]);
		    
		}
	}
}