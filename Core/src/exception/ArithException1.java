package exception;
//Arithmetic Exception
public class ArithException1 {
public static void main(String[] args) {
	int a=8;
	int b=0;
try {
	int c=a/b;
	System.out.println(c);
} 
catch (ArithmeticException e) {
	System.out.println(e);
	System.out.println("kar kya raha h tu");
}	
System.out.println("try");
}
}
