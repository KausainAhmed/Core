package Encapsulation; 

public class Encapsulation1 {
   private int id; 
   private String firstname; 
   private String lastname ; 
   private int Address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
} 
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public int getAddress() {
	return Address;
}
public void setAddress(int address) {
	Address = address;
} 
   
   }

class Test  {
	public static void main(String[] args) {
     Encapsulation1 e = new Encapsulation1();
     e.setId(11);
     e.setFirstname("Kausain");
     e.setLastname("Ahmed");
     System.out.println(e.getId());
     System.out.println(e.getFirstname());
     System.out.println(e.getLastname());
	}
}
	


