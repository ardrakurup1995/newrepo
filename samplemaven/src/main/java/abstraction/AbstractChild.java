package abstraction;

public class AbstractChild extends AbstractionParent {
	public void show() {
		System.out.println("show");
	}
	

	public static void main(String[] args) {
		
		/*AbstractChild obj= new AbstractChild();
		obj.display();
		obj.display2();
		obj.show();*/
		AbstractionParent obj=new AbstractChild();//referance creation
		obj.display();
		obj.display2();
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		System.out.println("Abstraction");
		
		
		// TODO Auto-generated method stub
		
	}

}
