package SeeialDeserial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization1 {
public static void main(String[] args) {
	try {
	FileOutputStream fos=new FileOutputStream("E:/IO/Serial.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	
	Employee emp=new Employee(11, "Dani", 225000, 69);
	oos.writeObject(emp);
	System.out.println("serializable ho rha h na ");
	
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
}
