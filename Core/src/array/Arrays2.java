package array;

public class Arrays2 {
public static void main(String[] args) {
	int a[]= {2,3,4,5,6,7,8};
	for(int i=0;i<a.length;i++) {
	if(a[i]==2 && a[i+1]==3) {
		a[i+2]=0;}
	}
		for (int j : a) {
			System.out.println(j);
		}
	}
}

