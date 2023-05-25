//https://www.codechef.com/problems/URCALC
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
		    double a=kk.nextInt();
		    double b=kk.nextInt();
		    char c=kk.next().charAt(0);
		    switch(c){
		        case '+':
		            System.out.println(a+b);
		            break;
		        case '-':
		            System.out.println(a-b);
		            break;
		        case '*':
		            System.out.println(a*b);
		            break;
		        case '/':
		            System.out.println(a/b);
		            break;
		        default:
		                System.out.println("Mohammad Faisal Khan");
		    }	    
		}
	}
}
