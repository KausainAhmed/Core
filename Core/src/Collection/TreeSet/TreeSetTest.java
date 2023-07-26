package Collection.TreeSet;

import java.util.*;

public class TreeSetTest {
public static void main(String[] args) {
	
	Set<StringBuffer> s=new TreeSet<>();
	s.add(new StringBuffer("Amar"));
	s.add(new StringBuffer("Akbar"));
	s.add(new StringBuffer("Anthony"));
	//s.add(new StringBuffer(null));
	
	//System.out.println(s);
	for (StringBuffer x : s) {
		System.out.println(x);
		
	}
}
}
/* doesn't maintain insertion order and returns values
 * in ascending order. null not allowed  */
