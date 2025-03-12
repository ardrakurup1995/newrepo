package superkey;

public class SuperConstructorChild extends SuperConstructor {
	
public SuperConstructorChild() {
	super(5,7);
	System.out.println("defalt constructor");
}

	public static void main(String[] args) {
		SuperConstructorChild obj=new SuperConstructorChild();
		
		// TODO Auto-generated method stub

	}

}
