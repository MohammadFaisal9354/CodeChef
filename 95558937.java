//https://www.codechef.com/problems/GENE01
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
        char c1=kk.next().charAt(0);
        char c2=kk.next().charAt(0);
        if((c1=='R')||(c2=='R'))
        System.out.println('R');
        else if((c1=='B')||(c2=='B'))
        System.out.println('B');
        else
        System.out.println('G');
	}
}