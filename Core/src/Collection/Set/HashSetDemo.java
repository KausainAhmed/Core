package Collection.Set;

import java.util.*;

public class HashSetDemo {
public static void main(String[] args) {
	Random r=new Random();
List <Integer> li=new ArrayList<>();

for (int i = 0; i <=10; i++) {  //inc. by 10 upto 5
int number=r.nextInt(5);
li.add(number);
}

System.out.println("List = "+li);
Set<Integer> set=new HashSet<>(li);
System.out.println("set = "+set);
}
}
