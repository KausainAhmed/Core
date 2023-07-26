package String;

public class StringBufferMethods {
	public static void main(String[] args) {

		String z = "xyz";
		StringBuffer sb = new StringBuffer(z);
		System.out.println(sb.reverse());
		System.out.println(z.equals(sb)); // reference comparison

		StringBuffer sc = new StringBuffer("Hello");
		StringBuffer sd = new StringBuffer("world");
		System.out.println(sc.append(sd));
// concat in String and append in buffer and builder
		StringBuffer s4 = sc.insert(1,"xoxo");
		System.out.println(s4);

		StringBuffer s5 = sc.replace(0, 3, "cuckoo");
		System.out.println(s5);
		System.out.println(s5.capacity());
		System.out.println(s5.delete(2, 4));
	}
}
