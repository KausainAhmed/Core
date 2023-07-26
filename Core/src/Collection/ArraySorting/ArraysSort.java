package Collection.ArraySorting;

import java.util.*;

public class ArraysSort {
public static void main(String[] args) {
	int a[]= {40,10,15,20};	
	
	System.out.println("Before Sort");
	for (int i : a) {
		System.out.println(i);
}
	
	System.out.println();
	Arrays.sort(a);  //Ascending Sorting 
	System.out.println("After Sort");
	for (int i : a) {
		System.out.println(i);
	}
	System.out.println();
	System.out.println("Descending order in sorting");
	String s[]= {"Any","Body","Can","Dance"};
	Arrays.sort(s, new MyComparator());
	for (String ss : s) {
		System.out.println(ss);
	}
	System.out.println();
	
	List<String> l=Arrays.asList(s);
	s[1]="M";
	//l.add("O");
	System.out.println(l);
}
}
