package GenericCollection;
import java.util.*;

public class MyGeneric<T extends Exception> {
T obj;

public MyGeneric(T obj) {   //Constructor
	super();
	this.obj = obj;
}
public void displayObjectDetail() {
	System.out.println("The type is "+obj.getClass().getName());
}
public T getObject() {
	return obj;
}

}
