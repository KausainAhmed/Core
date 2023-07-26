package exception;

public class MulCatch {
public static void main(String[] args) {
	int a=12;
	int b=0;
try {
	int c=a/b;
	System.out.println(c);
} catch (ArrayIndexOutOfBoundsException e) {
	System.out.println("ArrayIndexOOB");
}	
catch(NullPointerException e) {
	System.out.println("nullpointer Exception");
}
catch (ArithmeticException e) {
	System.out.println("Arithmetic Exception");
}
finally {
	System.out.println("m nahi to kon be ");
}
System.out.println("finally");
}
}

/* when we having multiple catch blocks , it is noted that 
parent Exception should be always in lower catch , otherwise 
it will throw new exception.
logic is "jab baap handle kr lega to beta q ayega"
and second scenario, it'll not throw any exception but
"jab bete ne handle kr liya to baap ki kya jaroorat"  */

