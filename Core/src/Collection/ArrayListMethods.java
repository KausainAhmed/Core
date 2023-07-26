package Collection;

import java.util.*;

public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList<Integer> AL = new ArrayList<>();
		AL.add(10);
		AL.add(10);
		AL.add(30);
		AL.add(20);
		AL.add(3, 24);
		AL.remove(2);
		AL.set(3, 42);
		System.out.println(AL);

		List<Integer> list = new ArrayList<>();
		list.add(121);
		list.add(131);
		list.add(141);

		list.addAll(AL);
		System.out.println(list.contains(151));
		System.out.println(list.containsAll(AL));
		list.remove(0);
		System.out.println(list);
	} 
}
