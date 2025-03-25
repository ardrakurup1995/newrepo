package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("apple");
		names.add("grapes");
		names.add("pappaya");
		names.add("orange");
		names.add("banana");
		names.add("orange");
		
		System.out.println(names);
		
		names.set(3, "strawbarry");
		System.out.println(names);
		
		System.out.println(names.get(4));
		
		System.out.println(names);
		
		names.add("apple");
		System.out.println(names);
		
		System.out.println(names.indexOf("apple"));
		System.out.println(names.lastIndexOf("apple"));
		// TODO Auto-generated method stub
        
		names.remove(2);
		System.out.println(names);
		
		System.out.println(names.contains("banana"));
	}

}
