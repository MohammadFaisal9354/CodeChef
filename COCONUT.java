//https://www.codechef.com/problems/COCONUT
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
		    int x=kk.nextInt();
		    int y=kk.nextInt();
		    x=kk.nextInt()/x;
		    y=kk.nextInt()/y;
		    System.out.println(x+y);
		}
	}
}
