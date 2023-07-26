package GenericCollection;
import java.util.*;

public class AnyRunnableTest {
public static void main(String[] args) {
	AnyRunnable<Thread> t=new AnyRunnable<Thread>();
	AnyRunnable<String> s=new AnyRunnable<>(String);
}
}
