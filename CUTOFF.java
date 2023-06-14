//https://www.codechef.com/problems/CUTOFF
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
		    int no_of_student_pass=kk.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    a[i]=kk.nextInt();
		    Arrays.sort(a);
		    System.out.println(a[n-no_of_student_pass]-1);
		}
	}
}
