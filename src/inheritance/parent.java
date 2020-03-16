package inheritance;

public class parent {
	
	
		void methodofparentclass()
		{
			System.out.println("parents method");
		}
		}
		class child extends parent
		{
			void methodofparentclass() {
				System.out.println("childs method");
			}
		}
		class methodoverriding
		{
			public static void main(String[]args)
			{
				parent obj1=new parent();
				obj1.methodofparentclass();
				child obj2=new child();
				obj2.methodofparentclass();
				
			}
}
