package exception;


public class throwsKeyword {
  public static void main(String[] args) throws ArithmeticException{
	  int num=2;
	if(num<10) {
		throw new ArithmeticException("less than 10");
	}else {
		System.out.println("num is greater than 10");
	}
	System.out.println("try");
	
}
}
