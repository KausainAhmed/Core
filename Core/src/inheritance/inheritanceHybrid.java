package inheritance;

public class inheritanceHybrid {
void m11() {
	System.out.println("parent");
}
}

class A1 extends inheritanceHybrid {
	void m22() {
		System.out.println("child A");
	}
}
class B1 extends inheritanceHybrid {
	void m33() {
		System.out.println("child B");
	}
	public static void main(String[] args) {
		B1 b=new B1();
		b.m11();
		//b.m2();  C.E 
		b.m33();
		
		System.out.println();
		
		A1 a1=new A1();
		a1.m11();
		a1.m22();
		//a1.m33();  C.E
	}
}
