package GenericCollection;

import java.util.ArrayList;

public class WildCardParametres {
public static void main(String[] args) {
	WildCardParametres<?> w=new WildCardParametres();
	w.myMethod(new ArrayList<A>());
}
public void myMethod(ArrayList <? super B>) {
}
}

