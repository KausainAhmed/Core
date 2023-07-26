package Collection.ConcurrentCollection;

import java.util.*;

public class ArrayListProblem {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList();
		al.add("java");
		al.add("mava");
		al.add("kava");
		al.add("aava");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);

			if (s.equals("mava")) {
				System.out.println("done");
				al.remove(s);
			}
		}
	}
}
