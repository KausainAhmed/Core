package Collection.HashMap;

import java.util.*;

public class TestHashMap {
public static void main(String[] args) {
	HashMap <Student1,String> map=new HashMap<>();
	Student1 s1=new Student1("Hussain");
	map.put(s1, "value1");
	System.out.println(s1.hashCode());
	System.out.println(map.get(s1));
	
	s1.setName("Zaid");
	System.out.println(s1.hashCode());
System.out.println(map.get(s1));
	System.out.println(map);
}
}

/* Hashmap works on key n value pair where keys are
 * immutable b/c hashmap works according to hashcodes 
 * and if the keys got changed by any method than the
 * values are also likely to be changed. Thus keys in 
 * hashmap are made immutable. for explaining this,
 * we made the class as immutable i.e final class
 * and final private data members so that the keys 
 * can't  be changed.   */
