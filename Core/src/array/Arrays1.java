package array;


public class Arrays1 {
public static void main(String[] args) {
	int arr[]=new int[5];
	arr[0]=10;
	arr[1]=20;
	arr[2]=new Integer(30);
	arr[3]=40;
	arr[4]=50;
	
	
	System.out.println("using for loop");
	for(int i=0;i<arr.length-1;i++) {
		System.out.println(arr[i]);
	}
	
	
	System.out.println("using for-each loop");
	for (int i : arr) {
		System.out.println(i);
	}
}
}
