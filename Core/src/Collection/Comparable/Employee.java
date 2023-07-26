package Collection.Comparable;

public class Employee implements Comparable<Employee> {
int id;
String name;

public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

@Override
public int compareTo(Employee o) {
int x=this.id;
int y=o.id;
if(x>y) {
	return 1;}
else if(x<y) {
	return -1;}
else {
	return 0;
}
} 
}
