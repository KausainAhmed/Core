package InputOutputIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;

public class BufferReaderDemo {
	public static void main(String[] args) {
		int count = 0;

		FileReader fr;
		try {
			fr = new FileReader("E:/IO/A.txt");
			BufferedReader br = new BufferedReader(fr);

			String line;
			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line);

				while (st.hasMoreTokens()) {
					System.out.println(st.nextElement());
					// count++;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}