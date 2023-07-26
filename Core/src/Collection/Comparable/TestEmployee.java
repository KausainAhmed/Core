package Collection.Comparable;
import java.util.*;
public class TestEmployee {
public static void main(String[] args) {
	
	Set<Employee> s=new TreeSet<>(new EmployeeComparator());
	s.add(new Employee(10, "kausain"));
	s.add(new Employee(20, "Nihal"));
	s.add(new Employee(30, "Husain"));
	s.add(new Employee(40, "Saurabh"));
	s.add(new Employee(50, "Suraj"));
	
	for (Employee e : s) {
		System.out.println(e.id);
		System.out.println(e.name);
	}
}}