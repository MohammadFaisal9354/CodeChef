//https://www.codechef.com/problems/TVDISC
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
		    int a=kk.nextInt();
		    int b=kk.nextInt();
		    a-=kk.nextInt();
		    b-=kk.nextInt();
		    if(a<b)
		    System.out.println("First");
		    else if(a>b)
		    System.out.println("Second");
		    else
		    System.out.println("Any");
		}
	}
}