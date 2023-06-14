//https://www.codechef.com/problems/EZSPEAK
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
		    int count=0;
		    int n=kk.nextInt();
		    kk.nextLine();
		    String s=kk.nextLine();
		    for(int i=0;i<=n-1;i++)
		    {
		        if(s.charAt(i)!='a'&& s.charAt(i)!='e'&&s.charAt(i)!='i'&&s.charAt(i)!='o'&&s.charAt(i)!='u')
		        count++;
		        else
		        count=0;
		        if(count==4)
		        break;
		    }
		    if(count==4)
		    System.out.println("NO");
		    else
		    System.out.println("YES");
		}
	}
}
