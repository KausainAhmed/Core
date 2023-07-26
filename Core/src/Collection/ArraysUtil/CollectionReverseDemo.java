package Collection.ArraysUtil;
import java.util.*;

public class CollectionReverseDemo {
	public static void main(String[] args) {
		
	
List<Integer> l=new ArrayList<>();
l.add(10);
l.add(20);
l.add(30);
l.add(40);

System.out.println("Before reversing\n "+l);
	Collections.reverse(l);
	System.out.println("After reversing \n"+l);
	}}
