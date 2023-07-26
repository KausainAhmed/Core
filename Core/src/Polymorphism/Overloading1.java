package Polymorphism;

public class Overloading1 {
void poly(float f){
System.out.println(f);	
}
void poly(String s){
System.out.println(s);	
}

void poly(int i){
System.out.println(i);	
}

static void poly(boolean b){
System.out.println(b);	
}
public static void main(String[] args) {
	Overloading1 o=new Overloading1();
	o.poly(2.5f);
	o.poly("radio-mirchi");
	o.poly(23);
	poly(true);
	System.out.println(o);
	System.out.println(o.hashCode());
}
}
