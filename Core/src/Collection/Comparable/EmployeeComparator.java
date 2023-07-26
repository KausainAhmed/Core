package Collection.Comparable;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		String s1=o1.name;
		String s2=o2.name;
		return s1.compareTo(s2);
	}
}
