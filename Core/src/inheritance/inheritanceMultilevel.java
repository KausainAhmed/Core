package inheritance;

public class inheritanceMultilevel {
	void m1() {
		System.out.println("parent m1");
	}
}

class A extends inheritanceMultilevel {
	void m2() {
		System.out.println("child A");
	}
}

class B extends A {
	void m3() {
		System.out.println("child B");
	}
	
	public static void main(String[] args) {
		B obj=new B();
		obj.m1();
		obj.m2();
		obj.m3();
			
	}
}