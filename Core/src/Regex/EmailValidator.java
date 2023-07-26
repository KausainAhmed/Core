package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
public static void main(String[] args) {
	
	Pattern p=Pattern.compile("^[a-zA-Z0-9_.]+@[a-zA-Z0-9_.-]+$");
	Matcher m=p.matcher("kausain.ahmed786@gmail.com");
	
	if(m.matches()) {
		System.out.println("Valid");
	}else {
		System.out.println("Invalid");
	}
}
}
