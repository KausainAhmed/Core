package Regex;
import java.util.regex.*;

public class SplitDemo {
	public static void main(String[] args) {
		
Pattern p=Pattern.compile("\s");
String s[]=p.split("I am a devil of my World");
for(String s1:s) {
System.out.println(s1);
}

}}
