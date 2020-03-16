package javaprograms;
import java.util.Scanner;
public class dectobinary {
	public static void main(String[] args) {
		int n,l,count=0;
		String x;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number of elements");
		n=input.nextInt();
		x=Integer.toBinaryString(n);
		System.out.println(x);
		l=x.length();
		for(int i=0;i<l;i++)
		{
			if(x.charAt(i)=='1')
				count++;
		}
		System.out.println("count of ones is: "+count);
		input.close();
		
		

	}

}
