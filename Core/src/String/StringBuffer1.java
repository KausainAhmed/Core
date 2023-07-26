package String;

//Using reverse method of StringBuffer in String
public class StringBuffer1 {
public static void main(String[] args) {
	String s="uoy kcuf";
	StringBuffer sBuffer=new StringBuffer(s);
	System.out.println(sBuffer.reverse());
}
}
// reverse a string without buffer's reverse method
class Sreverse {
	public static void main(String[] args) {
		String xx=""; char ch;
		String x="pogo";
		System.out.println("reverse a string");
		
		for(int i=0;i<x.length();i++) {
			ch=x.charAt(i);
			xx=ch+xx;
		}
		System.out.println(xx);
	}
}

class reverse {
	public static void main(String[] args) {
		String s1="yadevol";
		for(int i=s1.length();i>0;i--) {
			System.out.print(s1.charAt(i-1));
		}
	}
}