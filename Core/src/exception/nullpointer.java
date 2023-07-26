package exception;

public class nullpointer {
	public static void main(String[] args) {
		
try {
String s=null;
   System.out.println(s.length());
}catch (NullPointerException e) {
	System.out.println(e );
	System.out.println("nalla nalla hi rahega");
}
System.out.println("try");
}
}
// when we perform any operation on any null value, 
// we it will throw a null pointer exception