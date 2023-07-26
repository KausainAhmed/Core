package exception;

public class NumberFormatExceptionx {
public static void main(String[] args) {
	try {
	String t="pogo";
	Integer i=Integer.parseInt(t);
	System.out.println(i);
	}catch (NumberFormatException e) {
		System.out.println(e);
		System.out.println("String can't be changed to int");
	}
}
}
