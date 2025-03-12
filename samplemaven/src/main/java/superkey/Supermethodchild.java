package superkey;

public class Supermethodchild extends Supermethod  {
	
	public void display2() {
		super.display();
		System.out.println("world");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supermethodchild obj=new Supermethodchild();
		obj.display2();
		
	}

}
