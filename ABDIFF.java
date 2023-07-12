//https://www.codechef.com/problems/ABDIFF
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Faisal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner kk=new Scanner(System.in);
		    int n=kk.nextInt();
		    int m=kk.nextInt();
		    int add=n+m;
		    int mul=n*m;
		    System.out.println(Math.abs(mul-add));
	}
}
