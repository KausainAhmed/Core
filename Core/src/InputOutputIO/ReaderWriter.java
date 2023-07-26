package InputOutputIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriter {
	public static void main(String[] args) {
		
	
FileReader r=null;
FileWriter s=null;

try {
	r=new FileReader("E:\\IO\\A.txt");
	s=new FileWriter("E:\\IO\\B.txt");
	
	int i;
	while ((i=r.read())!=-1) {
		s.write(i);
	}
	
} catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (IOException e) {
	e.printStackTrace();
}
finally{

	try {
		r.close();
		s.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
System.out.println("file created");

}}
