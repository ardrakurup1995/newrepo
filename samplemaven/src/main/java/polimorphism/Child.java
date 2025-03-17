package polimorphism;

public class Child extends Parent {
	public void sum(int a,int b)
	{
		super.sum(12,14);
		int c=a+b;
		System.out.println("child sum"+c); //override
	}


	public static void main(String[] args) {
		
		Child obj=new Child();
		obj.sum(20,30);
		
		// TODO Auto-generated method stub

	}

}
