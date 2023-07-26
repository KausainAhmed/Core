package InputOutputIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* reading a file from a particular path and displaying its
 * content on the console.
 */

public class FileInputOutputStream2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("E:\\IO\\MyFile.txt");
			System.out.println("file opened");
			fos= new FileOutputStream("E:\\IO\\MyFile1.txt");
			
			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
				fos.write(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println();
			System.out.print("File Closed");
		}

	}
}
