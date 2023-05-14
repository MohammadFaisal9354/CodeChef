//https://www.codechef.com/problems/BMI
/* package codechef; // don't place package name! */

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
		    double m=kk.nextInt();
		    double h=Math.pow(kk.nextInt(),2);
		    double bmi=m/h;
		    if(bmi<=18)
		    System.out.println(1);
		    else if(bmi>=19&&bmi<=24)
		    System.out.println(2);
		    else if(bmi>=25&&bmi<=29)
		    System.out.println(3);
		    else
		    System.out.println(4);
		}
	}
}
