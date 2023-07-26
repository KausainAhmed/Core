package String;

public class Stringxx {
   int id;
   String name;
   
   Stringxx(int id, String name){
	this.id=id;
	this.name=name;
}
}

class Demo  {
	public static void main(String[] args) {
		Stringxx xx=new Stringxx(2, "bob");
		Stringxx xxx=new Stringxx(2, "bob");
		System.out.println(xx +" \n"+ xxx);
		
		String t1="abc";
		String t2="abc";
		String t3="xyz";
		String t4=new String("abc");
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		System.out.println(t4.hashCode());
		System.out.println(t1.equals(t4));
		
		
// HashCode is same for the objects creating in heap and scp
		//because hashcode is generated on basis of content.
// hashcode of t1 and t4 is same as content is same but we can check
// their refrence is different is by using == method.
	}
}
