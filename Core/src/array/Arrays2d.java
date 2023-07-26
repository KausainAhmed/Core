package array;

public class Arrays2d {
public static void main(String[] args) {
	int [][] arr= {{1,2,3},{2,3,4},{3,4,5}};
	System.out.println("Printing 2d arrays");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[i][j]);
		}
		System.out.println();
	}
}
}
