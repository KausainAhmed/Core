package Collection.ArraysUtil;
import java.util.*;

public class SortedList {
public static void main(String[] args) {
	List<String> li=new ArrayList<>();
	li.add("u");
	li.add("c");
	li.add("f");
	li.add("k");
	
	System.out.println("Before sorting \n"+li);
	Collections.sort(li);
	System.out.println("After Sorting \n"+li);
	
	int result=Collections.binarySearch(li, "f");
	System.out.println("index is = "+result);
}
}
