package exception;
import java.io.*;
import java.io.IOException;

class M{
	void m1() throws IOException {
throw new IOException("Deviec Error");}
}
class Test {
	public static void main(String[] args) {
		try {
			M m=new M();
			m.m1();
		} catch (Exception e) {
			//System.out.println(e);
			System.out.println("exception hanlded");
		}
		System.out.println("nomal flow");
	}
}
