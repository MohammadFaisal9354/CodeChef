//https://www.codechef.com/problems/ATM2
import java.util.*;
import java.lang.*;
import java.io.*;
class Faisal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner kk=new Scanner(System.in);
		int t=kk.nextInt();
		while(t-->0)
		{
		    int n=kk.nextInt();
		    int k=kk.nextInt();
		    for(int i=0;i<n;i++)
		    {
		        int tem=kk.nextInt();
		        if(tem<=k)
		        {
		            k=k-tem;
		            System.out.print(1);
		        }
		        else
		        System.out.print(0);
		    }
		    System.out.println();
		}
	}
}
