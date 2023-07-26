package String;

public class StringMethods {
	public static void main(String[] args) {

		String s = "TechSkills Solution";
		System.out.println("String = " + s);
		System.out.println("length = " + s.length());
		System.out.println("Index of 'l' is " + s.indexOf('l'));
		System.out.println("Last Index of 'l' is " + s.lastIndexOf('l'));
		System.out.println("Character at given index is = " + s.charAt(4));
		System.out.println("Substring at 3-8 = " + s.substring(3, 8));
		String s2 = "ab,bc,cd,de,ef";
		System.out.println("String s2=ab,bc,cd,de,ef");
		System.out.println("Splitting s2 on basis of ',' in 4 parts : ");
		String a[] = s2.split(",", 4);
		for (String x : a) {
			System.out.println(x);
		}
		System.out.println("replacing T with K in s");
		System.out.println(s.replace('l', 'z'));
		System.out.println("upper case = " + s.toUpperCase());
		System.out.println("lower case = " + s.toLowerCase());
		String s3 = "  xoxo pogo  ";
		System.out.println("s3=  xoxo pogo   ");
		System.out.println(s3.trim());// removes blank spaces before n after
		String s4 = new String("bob");
		String s5 = s4.intern();
		System.out.println(s5);

		// -----compareTo compares 2 strings on basis of ASCII value
		String s6 = "abc";
		String s7 = "abc";
		System.out.println(s6.compareTo(s7)); // return 0 for equal string

		String s6a = "abc";
		String s7a = "bbc";
		System.out.println(s6a.compareTo(s7a)); // return -ve when s2 is gretaer

		String s6b = "bbc";
		String s7b = "abc";
		System.out.println(s6b.compareTo(s7b)); // return +ve when s1 is greater
		/* -------------------------------------------------------------//
if we compare two strings having same characters and having one extra letter 
at the end , then it'll return number of letter difference. for eg. */
	String sp="son";
	String sq="sont";
//here 2nd string is greater in size, hence it'll return a -ve no
	// and 1 character is more , so it'll give -1
	System.out.println("Comparing sp and sq =  "+sp.compareTo(sq));
	
	}
	
}
