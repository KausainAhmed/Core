package com.core.wrapper;

public class WrapperClass1 {
public static void main(String[] args) {
	int i=10;   String s="2000";
// converting int to Integer i.e primitive to non-primitive data-type (Auto-boxing)
	Integer i1=Integer.valueOf(i); 
	System.out.println(i1);
//converting int to String 	
	String s1=i1.toString(i);
	
//***********************************************//	
Integer y=new Integer(s);// coverted string into Integer
System.out.println(y);

int i5=Integer.valueOf(y); //String Integer into int 
System.out.println(i5);
}
}
