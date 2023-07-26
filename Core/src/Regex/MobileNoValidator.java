package Regex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNoValidator {
public static void main(String[] args) {
	Pattern p=Pattern.compile("^\\d{10}");
	Matcher m=p.matcher("7087959715");
	
	if(m.matches()) {
		System.out.println("Valid");
	} else {
		System.out.println("Invalid");
	}
}
}
