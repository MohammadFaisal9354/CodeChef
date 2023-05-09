//https://www.codechef.com/problems/GOODWEAT
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
		    int oneCount=0,zeroCount=0;
		    for(int i=0;i<7;i++)
		    {
		        if(kk.nextInt()==1)
		        oneCount++;
		        else
		        zeroCount++;
		        
		    }
		    System.out.println((oneCount>zeroCount)?"YES":"NO");
		}
	}
}
