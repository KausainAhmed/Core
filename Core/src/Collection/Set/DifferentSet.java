package Collection.Set;

import java.util.*;

public class DifferentSet {
public static void main(String[] args) {
	Random r=new Random();
	//HashSet<Integer> hs=new HashSet<>();
	//LinkedHashSet<Integer> hs=new LinkedHashSet<>();
	TreeSet<Integer> hs=new TreeSet<>();
	
	for (int i = 0; i <6; i++) {
	int x=r.nextInt(100);
	hs.add(x);
	System.out.println(x);
	}
	System.out.println(hs);
	
	
}
}
