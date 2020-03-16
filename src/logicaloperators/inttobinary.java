package logicaloperators;
import java.util.Scanner;
;
public class inttobinary {
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		System.out.println("The number of ones in: "+num+"("+Integer.toBinaryString(num)+")");
		int result=countOne(num);
		System.out.println("is: "+result);
		sc.close();
	}
	static int countOne(int n)
	{
		int count=0;
		while (n>0)
		{
			n=n&(n-1);
			count++;
		}
	return count;
	}}

