//https://www.codechef.com/problems/CCHOCOLATES
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
		    int x=kk.nextInt()*5;
		    int y=kk.nextInt()*10;
		    int z=kk.nextInt();
		    System.out.println((x+y)/z);
		}
	}
}