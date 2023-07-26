package Collection;
//Printing random numbers
import java.util.Random;

public class RandomClass {
public static void main(String[] args) {
	Random r=new Random();
	int x=r.nextInt(10);
	int y=r.nextInt(50);
System.out.println(x+" "+y);
}
}
