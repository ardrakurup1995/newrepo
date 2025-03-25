package collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		Set<String>s=new HashSet <String>();
		s.add("white");
		s.add("pink");
		s.add("blue");
		s.add("orange");
		s.add("yellow");
		System.out.println(s);
		
		Set<String>s1=new HashSet <String>();
		s1.add("ash");
		s1.add("violet");
		s1.add("red");
		s.addAll(s1);
		System.out.println(s);
		
		System.out.println(s.contains("white"));
		
		System.out.println(s1.containsAll(s));
		
		System.out.println(s.isEmpty());
		
		s.remove("blue");
		System.out.println(s);
		
		s.removeAll(s1);
		System.out.println(s);
		
		s1.clear();
		System.out.println(s1);
		
		// TODO Auto-generated method stub

	}

}
