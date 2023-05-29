//https://www.codechef.com/problems/SEATNUMBER
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
		    int n=kk.nextInt();
		    if(n>=1&&n<11)
		    System.out.println("Lower Double");
		    else if(n>10&&n<16)
		    System.out.println("Lower Single");
		    else if(n>15&&n<26)
		    System.out.println("Upper Double");
		    else 
		    System.out.println("Upper Single");
		}
	}
}
