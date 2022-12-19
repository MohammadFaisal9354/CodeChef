//https://www.codechef.com/problems/ATTENDU
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
		    int zero=0,one=0;
		    for(int i=0;i<n;i++)
		    {
		        if(s.charAt(i)=='0')
		        zero++;
		        else
		        one++;
		    }
		    one=one+(120-n);
		    //System.out.println(one);
		    if(one>=90)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}