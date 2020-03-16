package execeptions;
import java.util.Scanner;
public class DivededByZero {
	public static void main(String[] args) {
		/*try
		{
		int a=10,b=5;
		int fraction =a/b;
		System.out.println("not exccuted");
		}
		catch(ArithmeticException e)
		{
		System.out.println("inthe catch due to exception= "+e);
		
		}
		System.out.println("end of main");
	}*/
/*try {
	int a=5,b=0;
	int fraction =a/b;
	System.out.println("not executed");
}
catch(ArithmeticException e)
{
	System.out.println("in the catch due to exeption=" +e);
	
}
finally
{
	System.out.println("inside the finnaly block");
}
}*/
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		 
		int a ;
		try
		{
			a=sc.nextInt();
		}
	catch(Exception e)
	{
	System.out.println("inalid number")	;
	a=0;
	
	}
		System.out.println("valueof a:"+a);
		sc.close();
	}
	
	{
		
	}
}
