package inheritance;
//Single level inheritance

public class inheritanceSingle {
	void m1() {
		System.out.println("In Parent");
	}
}

class Child extends inheritanceSingle {
	void m2() {
		System.out.println("In Child");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
		c.m2();
	}
}
