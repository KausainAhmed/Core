package GarbageCollection;

public class GC {
	int id;

	public GC(int id) {
		super();
		this.id = id;
		System.out.println("Created = "+this.id);
	}
	GC(){
		System.out.println(this+"Created");
	}
	public static void main(String[] args) {
		new GC(1);
		new GC(2);
		for (int i = 0; i <=1000000; i++) {
			System.gc();
			//new GC(i);
			}
	}
}

