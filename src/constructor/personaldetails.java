package constructor;

public class personaldetails {
	String name;
	int age;
    personaldetails()
    {
    	this.age=20;
    	this.name="Seeta";
    }

personaldetails(String n,int a)
{
	this.age=a;
	this.name=n;
}
public static void main(String[] args)
{
	personaldetails obj1=new personaldetails();
	personaldetails obj2=new personaldetails("Seeta",20);
	System.out.println(obj1.name+""+obj1.age);
	System.out.println(obj2.name+""+obj2.age);
	
}

}
