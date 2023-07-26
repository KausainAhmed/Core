package inheritance;

 interface pi1 {
void n1();
}

 interface pi2 {
	 void n2();
 }
 class Test implements pi1,pi2{
	public void n1() {
		 System.out.println("n1");
	 }
	public void n2() {
		 System.out.println("n2");
	 }
	 
	 public static void main(String[] args) {
		Test t=new Test();
		t.n1();
		t.n2();
	}
 }
