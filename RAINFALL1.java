//https://www.codechef.com/problems/RAINFALL1
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
		    if(n<3)
		    System.out.println("LIGHT");
		    else if(n>=3&&n<7)
		    System.out.println("MODERATE");
		    else
		    System.out.println("HEAVY");
		}
	}
}