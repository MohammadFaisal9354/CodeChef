import java.util.*;
import java.lang.*;
import java.io.*;

class Faisal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner kk=new Scanner(System.in);
		int testcases=kk.nextInt();
		while(testcases-->0)
		{
		    int n=kk.nextInt();
		    if(n>6)
		    System.out.println("GOLD");
		    else if(n>3)
		    System.out.println("SILVER");
		    else
		    System.out.println("BRONZE");
		}
	}
}
