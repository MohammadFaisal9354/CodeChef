//https://www.codechef.com/problems/MONOPOLY2
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Faisal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner kk=new Scanner(System.in);
		int testcases=kk.nextInt();
		while(testcases-->0)
		{
		    int a=kk.nextInt();
		    int b=kk.nextInt();
		    int c=kk.nextInt();
		    int d=kk.nextInt();
		    int total=a+b+c+d;
		    if(a>total-a)
		    System.out.println("YES");
		    else if(b>total-b)
		    System.out.println("YES");
		    else if(c>total-c)
		    System.out.println("YES");
		    else if(d>total-d)
		    System.out.println("YES");
		    else
		    System.out.println("NO");	    
		}
	}
}
