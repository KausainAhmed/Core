package exception;

public class AIOOBE {
	//ArrayIndexOutOfBound Exception
public static void main(String[] args) {
try {	int arr[]=new int[4];
	 arr[0]=2;
	 arr[1]=3;
	 arr[2]=4;
	 arr[3]=5;
	 arr[4]=6;  // causing exception
	 
	 for (int i = 0; i < arr.length; i++) {
		System.out.println(i);
	}
}catch (ArrayIndexOutOfBoundsException e) {
	System.out.println(e);
	System.out.println("Aukat k bahar");
}
System.out.println("try");
			}
}
