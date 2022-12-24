//https://www.codechef.com/problems/UTKPLC
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
		int testcases=(kk.nextInt());
		while(testcases-->0)
		{
		    char a=kk.next().charAt(0);
		    char b=kk.next().charAt(0);
		    char c=kk.next().charAt(0);
		    char x=kk.next().charAt(0);
		    char y=kk.next().charAt(0);
		    if(a==x||a==y)
		    System.out.println(a);
		    else if(b==x||b==y)
		    System.out.println(b);
		    else
		    System.out.println(c);
		}
	}
}