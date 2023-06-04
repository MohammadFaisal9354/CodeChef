//https://www.codechef.com/problems/WATERFILLING
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
		    int m=kk.nextInt();
		    int o=kk.nextInt();
		    if(n==0&&m==0)
		    System.out.println("Water filling time");
		    else if(m==0&&o==0)
		    System.out.println("Water filling time");
		    else if(n==0&&o==0)
		    System.out.println("Water filling time");
		    else
		    System.out.println("Not now");
		    
		}
	}
}
