package javaprograms;
import java.util.Scanner;
public class sumandavg {
	public static void main(String[] args)
	{
		
	int sum=0,n;
	float avg;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no of elements in array");
	n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter all elements is array");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	sum=sum+a[i];
	}
	System.out.println("sum:"+sum);
	avg=(float)sum/n;
	System.out.println("avg:"+ avg);
	sc.close();
	}
	
	

}
