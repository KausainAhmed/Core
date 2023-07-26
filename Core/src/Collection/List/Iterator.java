package Collection.List;

import java.util.*;

public class Iterator {
public static void main(String[] args) {
	List<String> l=new LinkedList<>();
	l.add("Sab");
	l.add("moh");
	l.add("maya");
	l.add("hai");
	ListIterator<String> itr=l.listIterator();
	System.out.println("forward direction");
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println();
	System.out.println("backward direction");
	while(itr.hasPrevious()) {
		System.out.println(itr.previous());
	}

}
}
// Similar for Iterator just some method name change
// i.e itr.hasNext() , itr.next() , itr.remove
