package Polymorphism;

public class Overriding2 extends Overridinng1 {
	int m1(int a,int b) {
		return a*b;
	}

	float m2(float a,float b) {
		return a*b;
	}
	
	static int m3(int a,int b) {
		return a*b;
	}
	public static void main(String[] args) {
		Overridinng1 o2=new Overriding2();
		System.out.println(o2.m1(3,4));
		System.out.println(o2.m2(2.3f,3.8f));
		System.out.println(m3(3,4));  //method-hiding
	}
}
