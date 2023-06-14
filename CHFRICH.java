//https://www.codechef.com/problems/CHFRICH
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
		    int presentWorth=kk.nextInt();
		    int nextWorth=kk.nextInt();
		    int rate=kk.nextInt();
		    nextWorth=nextWorth-presentWorth;
		    System.out.println(nextWorth/rate);
		    
		}
	}
}
