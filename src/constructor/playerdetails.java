package constructor;

public class playerdetails {
	String Name,DOB;
	int age,hundreds,fiftys;
	playerdetails()
	{
		this.Name="kohli";
		this.DOB="6/8/1990";
		this.age=28;
		this.hundreds=25;
		this.fiftys=100;
	}

	public static void main(String[] args) {
		playerdetails b1=new playerdetails();
		System.out.println(b1.Name+" "+b1.age+" "+b1.DOB+" "+b1.hundreds+" "+b1.fiftys);
		// TODO Auto-generated method stub

	}
}
