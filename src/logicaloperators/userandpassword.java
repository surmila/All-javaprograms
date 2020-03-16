package logicaloperators;
import java.util.Scanner;
public class userandpassword {
	public static void main(String[]args)
	{
		String u,p;
		String username="urmila";
		String password="urmila123";
		Scanner input = new Scanner(System.in);
		System.out.println("enter username");
		System.out.println("enter password");
		u=input.nextLine();
		p=input.nextLine();
		if(u.equals(username)&&p.equals(password)||(u.equals(password)&&p.equals(username)))
		{
			System.out.println("Welcome to gmail");
		}
		else
		{
			System.out.println("Entered password is incorrect");
			input.close();
		}
		
	}
		
}
