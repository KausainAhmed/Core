package Regex;
import java.util.*;
import java.util.regex.Pattern;

public class CharacterAndQuantifiers {
public static void main(String[] args) {
	System.out.println(Pattern.matches("[abc]", "b"));
	System.out.println(Pattern.matches("\\d", "9"));
//	\\d will not include integers from 0-9
	System.out.println(Pattern.matches("\\D", "z"));
// Any character except any integer
	System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","pkmkb687"));
// can contain a-z;A-Z,0-9 but with a size limit of [i]
System.out.println(Pattern.matches("[a-zA-Z0-9]{2,5}","mkb"));
// similar as upper method , {initial size to final size}

}
}
