//https://www.codechef.com/problems/CHSFORMT
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
		    int a=kk.nextInt()+kk.nextInt();
		    if(a<3)
		    System.out.println(1);
		    else if(a<11)
		    System.out.println(2);
		    else if(a<61)
		    System.out.println(3);
		    else
		    System.out.println(4);
		}
	}
}
