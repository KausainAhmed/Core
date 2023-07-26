package exception;

public class CustomExcClass extends RuntimeException{
public CustomExcClass(String s) {
	super(s);
}
}

class Testz {
	void m1() {
		throw new CustomExcClass("chala ja");
		//System.out.println("hello");
	}
	public static void main(String[] args) {
		Testz test=new Testz();
		test.m1();
	}
}
