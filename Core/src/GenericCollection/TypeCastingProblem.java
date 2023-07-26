package GenericCollection;
import java.util.*;

public class TypeCastingProblem {
public static void main(String[] args) {
	String s[]=new String[10];
	s[0]="Kausain";
	s[1]="Nihal";
	
	List li=new ArrayList<>();
	li.add("Kausain");
	li.add("Nihal");
	
	//li.add(100);
	//System.out.println(li.get(2));
	
	String n=(String) li.get(0);//needs type-casting to hold values
	String n1=(String) li.get(1);
	System.out.println(n+" "+n1);
	
}
}
