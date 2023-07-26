package GenericCollection;
import java.util.*;

public class Test1 {
public static void main(String[] args) {
	MyGeneric<ArithmeticException> s=new MyGeneric<>(new ArithmeticException());
	s.displayObjectDetail();
	System.out.println(s.getObject());
	
	MyGeneric<Exception> i=new MyGeneric<Exception>(new  NullPointerException());
	i.displayObjectDetail();
	System.out.println(i.getObject());
}
}
