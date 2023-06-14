//https://www.codechef.com/problems/ONEFULPAIRS
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Faisal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner kk=new Scanner(System.in);
// 		int testcases=kk.nextInt();
// 		while(testcases-->0)
		{
		    int a=kk.nextInt();
		    int b=kk.nextInt();
		    if((a+b)+(a*b)==111)
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		}
	}
}
