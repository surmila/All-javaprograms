package strings;


	import java.util.Scanner;
	public class NumberofVowels {
		public static void main(String[] args) {
			String str;
			char ch;
			int count=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String");
			str=sc.nextLine();
			System.out.println("Vowels in string are");
			for(int i=0;i<str.length();i++) {
				str=str.toLowerCase();
				ch=str.charAt(i);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					count++;
			}
			System.out.println("Number of vowels are:"+count);
			sc.close();
			
		}
	}


