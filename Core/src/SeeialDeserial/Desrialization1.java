package SeeialDeserial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Desrialization1 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("E:/IO/Serial.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
Object obj=ois.readObject();
Employee emp =(Employee)obj;

System.out.println(emp.id);
System.out.println(emp.name);
System.out.println(emp.salary);
System.out.println(emp.div);

		} catch (Exception e) {
			e.printStackTrace();
		}
System.out.println("Desrialization ho rha h");
	}
}
