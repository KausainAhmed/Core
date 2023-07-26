package exception;

public class Throwkeyword {
public static void validate(int age)  {
	if(age<18) {
		throw new ArithmeticException("na munna na"); 
	}else {
		System.out.println("welcome to vote");}
	
	}
public static void main(String[] args) {
	validate(12);
	System.out.println("try");
}
}


// throw keyword used to throw a throw a custom ecxeption like
// in the above ex; "na munna na"
