//https://www.codechef.com/problems/PIZZA_BURGER
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
		    int money=kk.nextInt();
		    int pizza=kk.nextInt();
		    int burger=kk.nextInt();
		    if(money>=pizza)
		    System.out.println("PIZZA");
		    else if(money>=burger)
		    System.out.println("BURGER");
		    else
		    System.out.println("NOTHING");		    
		}
	}
}
