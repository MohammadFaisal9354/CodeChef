//https://www.codechef.com/problems/MVR
import java.util.*;
import java.lang.*;
import java.io.*;

class Faisal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		    Scanner kk=new Scanner(System.in);
		    int messi_goal=kk.nextInt()*2;
		    int messi_assist=kk.nextInt();
		    int ronaldo_goal=kk.nextInt()*2;
		    int rolnado_assist=kk.nextInt();
		    if((messi_goal+messi_assist)>(ronaldo_goal+rolnado_assist))
		    System.out.println("Messi");
		    else if((messi_goal+messi_assist)<(ronaldo_goal+rolnado_assist))
		    System.out.println("Ronaldo");
		    else
		    System.out.println("Equal");
	}
}
