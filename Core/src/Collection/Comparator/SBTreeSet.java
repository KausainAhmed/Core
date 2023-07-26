package Collection.Comparator;

import java.util.*;

public class SBTreeSet {
	public static void main(String[] args) {
		Set<StringBuffer> s = new TreeSet<>(new SBComparator());
		s.add(new StringBuffer("abc"));
		s.add(new StringBuffer("p"));
		s.add(new StringBuffer("abcde"));
		s.add(new StringBuffer("xyz"));
		s.add(new StringBuffer("35437"));
		for (StringBuffer e : s) {
			System.out.println(e);
		}
	}
}

//StringBuffer linked with SBComparator
//works on treeSet and returns in ascending order
