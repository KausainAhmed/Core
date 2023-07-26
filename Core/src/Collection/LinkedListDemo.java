package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.*;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> LL = new LinkedList<>();
		LL.add("a");
		LL.add("b");
		LL.add("c");
		LL.add("d");
		//System.out.println(LL);
		Iterator<String> itr = LL.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

class LinkedListComparison {
	public static void main(String[] args) {
		
		Object objects[]=new Object[10000000];
		for(int i=0;i<objects.length;i++) {
			objects[i]=new Object();
		}
		
		
			List<Object> LL = new ArrayList<>();
			LL.add("a");
			LL.add("b");
			LL.add("c");
			LL.add("d");  System.out.println(LL);
			
			/*
			 * ArrayList<Object> AL = new ArrayList<>(); AL.add("a"); AL.add("b");
			 * AL.add("c"); AL.add("d");
			 */
				
		long start = System.currentTimeMillis();
			for(Object obj:objects) {
			LL.add(obj);
			}
			
			long end = System.currentTimeMillis();
			System.out.println("time taken = "+(end-start));
		}
	}
	

