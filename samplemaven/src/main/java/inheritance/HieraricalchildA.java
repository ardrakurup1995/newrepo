package inheritance;

public class HieraricalchildA extends Hieraricalparent{
	public void display1() {
		System.out.println("child A");
		
	}

	public static void main(String[] args) {
		HieraricalchildA obj=new HieraricalchildA();
		obj.display();
		obj.display1();
		// TODO Auto-generated method stub

	}

}
