package abstraction;

interface I1 {
public abstract void a();  //public abstract methods by default in interface
void b(); 
void c();
void d();
int x=23;  // public static final data members by-default in interface
}

abstract class C1 implements I1{
abstract void abs(); //methods are public abstract by-default
int y; // 
 public void a() {System.out.println("a");}
 public void b() {System.out.println("b");}
}

class Test extends C1{
 public static void main(String[] args) {
	
 I1 x=new Test();
     x.a();
     x.b();
     x.c();
     x.d();
   // x.abs(); to run this we have to hold in abst. class's reference
     System.out.println(x);
     System.out.println(x.hashCode());
 
}

@Override
public void c() {	System.out.println("c");
}

@Override
public void d() { System.out.println("d");	

System.out.println(x); //direct calling b/c static member by-default
}

@Override
void abs() {System.out.println("abs");
 	
}}
