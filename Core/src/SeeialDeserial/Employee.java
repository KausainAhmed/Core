package SeeialDeserial;

import java.io.Serializable;

//Serialization 
public class Employee implements Serializable {
int id;
String name;
double salary;
transient int div;

public Employee(int id, String name, double salary, int div) {
this.id=id;
this.name=name;
this.salary=salary;
this.div=div;

}
}
