package execeptions;

public class outofboundary {
	public static void main(String[] args) {
		try {

		int num[]= {1,2,3,4,5};
		System.out.println("Acessing the element: " +num[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception thrown  :"+e);
		}
		
		
			System.out.println("outof the block");
	}
}
