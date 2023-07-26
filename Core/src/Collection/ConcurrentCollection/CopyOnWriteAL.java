package Collection.ConcurrentCollection;

import java.util.*;
import java.util.concurrent.*;

public class CopyOnWriteAL {
	public static void main(String[] args) {
		ArrayList<String> c = new ArrayList<>();//CopyOnWriteArrayList
		c.add("java");
		c.add("mava");
		c.add("kava");
		c.add("aava");
		Iterator<String> itr = c.iterator();
		while (itr.hasNext()) {
			String st = itr.next();
			System.out.println(st);
			c.add("DDLJ"); //cause of exception
		}
	}
}
//it'll throw an exception when we try to manipulate in between
//the operation, and to avoid this we use CopyOnWriteArrayList 
//class instead of ArrayList class.