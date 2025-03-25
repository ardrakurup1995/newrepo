package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		Set<String>s1=new HashSet <String>();
		s1.add("pink");
		s1.add("blue");
		s1.add("white");
		System.out.println(s1);
		
		Iterator it=s1.iterator();
		while(it.hasNext())
			{
		System.out.println(it.next());	
			}
		
		it.remove();
		System.out.println(s1);;
		// TODO Auto-generated method stub

	}

}
