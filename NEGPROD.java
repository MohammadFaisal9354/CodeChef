//https://www.codechef.com/problems/NEGPROD
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
		    int m=kk.nextInt();
		    int k=kk.nextInt();
		    if(n<0&&m<0&&k<0)
		    System.out.println("NO");
		    else if((n<0||m<0||k<0)&&(n>0||m>0||k>0))
		        System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
