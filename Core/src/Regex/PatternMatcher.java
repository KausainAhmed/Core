package Regex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
public static void main(String[] args) {
	
	Pattern pt=Pattern.compile("bcde");
	Matcher m=pt.matcher("abcdef");
	while (m.find()) {
	System.out.println(m.start());
	System.out.println(m.end());
	System.out.println(m.group());
		
	}
}
}
