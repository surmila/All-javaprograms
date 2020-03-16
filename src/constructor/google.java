package constructor;

public class google {
	String URL;
	int age;
	google()
	{
	this.URL="https://www.google.com/";
	this.age=18;
	}

	public static void main(String[] args) {
		google b1=new google();
		System.out.println("URL OF GOOGLE IS    "+b1.URL+"  "+"       AGE IS    "+b1.age);
		// TODO Auto-generated method stub

	}


}
