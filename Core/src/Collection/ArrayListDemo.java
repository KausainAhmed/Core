package Collection;

import java.util.ArrayList;

//ArrayList 
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(new Integer(10));
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(20);
		list.add(null);
		list.add(null);
		for (Integer i : list) {
			System.out.println(i);
		}
//	System.out.print(list);
	}
}

/*
 * Array List contains duplicate values, null values , and follow insertion
 * order , non sync and hence good for random access.
 */
