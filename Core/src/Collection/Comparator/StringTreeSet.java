package Collection.Comparator;

import java.util.*;

public class StringTreeSet {
public static void main(String[] args) {
	Set<String> s=new TreeSet<>(new StringComparator());
	
	s.add("as");
	s.add("wer");
	s.add("abc");
	s.add("12");
	s.add("z");
	
	for (String e : s) {
		System.out.println(e);
		
	}	
}
}
//StringComparator linked with StringTreeSet
//returns according to length and logic