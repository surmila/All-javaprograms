package javaprograms;

public class foreach {
	public static void main(String[] args)
	{
		int[] a={1,2,3,4,5};
		int sum=0;
		for(int i:a)
		{
			sum+=i;
			System.out.println("sum:"+sum);
		}
			
	}
}
