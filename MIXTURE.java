//https://www.codechef.com/problems/MIXTURE
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
		    int a=kk.nextInt();
		    int b=kk.nextInt();
		    if(a>0&&b>0)
		    System.out.println("Solution");
		    else if(b==0)
		    System.out.println("Solid");
		    else
		    System.out.println("Liquid");
		}
	}
}
