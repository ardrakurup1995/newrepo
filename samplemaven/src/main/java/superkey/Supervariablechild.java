package superkey;

public class Supervariablechild extends Supervariable{

	String colour="blue";
	public void display()
	{

		System.out.println(colour);
		System.out.println(super.colour);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supervariablechild obj=new Supervariablechild();
		obj.display();
	}

}
