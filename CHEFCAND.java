//https://www.codechef.com/problems/CHEFCAND
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
		    int n=kk.nextInt()-kk.nextInt();
		    if(n<=0)
		    System.out.println(0);
		    else if(n%4==0)
		    System.out.println(n/4);
		    else
		    System.out.println((n/4)+1);
		}
	}
}