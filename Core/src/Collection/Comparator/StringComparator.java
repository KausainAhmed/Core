package Collection.Comparator;

import java.util.*;

public class StringComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int x=o1.length();
		int y=o2.length();
if(x<y) {
	return -1;}
else if (x>y){
	return 1; }
else {
	return o1.compareTo(o2);
}
}}
