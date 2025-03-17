package aggregation;

public class Aggregation2child {
	
	String city;
	String state;
	Aggregationparent1 ref;// reference variable
	public Aggregation2child(String city, String state,Aggregationparent1 ref ) {
		this.city=city;
		this.state=state;
		this.ref = ref;
		
	}
public void display()
{
	System.out.println(ref.name+ ref.rollno);
	System.out.println(city+state);
}

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		Aggregationparent1 obj=new Aggregationparent1("Ammu", 10,8);
		Aggregation2child obj1= new Aggregation2child("Adoor"," Kerala", obj);
		obj1.display();
	}

}
