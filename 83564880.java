//https://www.codechef.com/START71C/problems/PERFECTTRIO
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
		    int n1=kk.nextInt();
		    int n2=kk.nextInt();
		    int n3=kk.nextInt();
		    boolean ans=false;
		    if(n1+n2==n3)
		    ans=true;
		    if(n1+n3==n2)
		    ans=true;
		    if(n2+n3==n1)
		    ans=true;
		    if(ans)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}