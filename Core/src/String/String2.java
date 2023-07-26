package String;

public class String2 {
public static void main(String[] args) {
	
	String1 s=new String1(69,"xoxo");
	System.out.println(s.getId());
	System.out.println(s.getName());
	System.out.println(s.hashCode());
	System.out.println();
	String1 s1=new String1(69,"xoxo");
	System.out.println(s1.getId());
	System.out.println(s1.getName());
	System.out.println(s1.hashCode());
	
	System.out.println("s.equals(s1) "+s.equals(s1));
}
}
