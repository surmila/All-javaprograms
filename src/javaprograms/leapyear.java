package javaprograms;
import java.util.Scanner;
public class leapyear {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the year ");
		Scanner d =new Scanner(System.in);
		n=d.nextInt();
		if(n%4==0&&n%100==0&&n%400==0)
		{
			System.out.println(" a leap year");
		}
				else
	{
		System.out.println("NOT a leap year");
	}
d. close();
}

}
