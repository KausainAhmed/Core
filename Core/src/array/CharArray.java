package array;

public class CharArray {
public static void main(String[] args) {
	char c[]= {'a','b','c','d','a'};
	
	for(int i=0;i<c.length;i++) {
		System.out.println(c[i]);
	}
	System.out.println();
	System.out.println("Checking 1ts and last index");
	if(c[0]==c[c.length-1]) {
		System.out.println("first and last element are same");
	}
	else {
		System.out.println("first and last are diffrent");
	}
	
}
}
