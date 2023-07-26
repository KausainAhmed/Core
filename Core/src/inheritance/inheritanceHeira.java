package inheritance;

interface p1{
void p1();
}

interface c1 extends p1{
	void c1();
}

interface c2 extends p1{
	void c2();
}

class Test1 implements c1,c2{
	public void p1() {
		System.out.println("p1");
	}
	
	public void c1() {
		System.out.println("c1");
	}
	
	public void c2() {
		System.out.println("c2");
	}
	
	public static void main(String[] args) {
		Test1 t= new Test1();
		t.c1();
		t.c2();
		t.p1();
	
	}
}




