/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Faisal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int testcases=sc.nextInt();
		while(testcases-->0)
		{
		    int x = sc.nextInt();
            int y = sc.nextInt();
            int z = (x+y)/2;
            System.out.println(Math.max(Math.abs(z-x),Math.abs(z-y)));
		    
		}
	}
}
