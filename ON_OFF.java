//https://www.codechef.com/problems/ON_OFF
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
		    String s=kk.next();
		    String s2=kk.next();
		    int c=0;
		    for(int i=0;i<n;i++)
		    {
		        if(s.charAt(i)!=s2.charAt(i))
		        c++;
		    }
		    if(c%2==0)
		    System.out.println(1);
		    else
		    System.out.println(0);
		}
	}
}