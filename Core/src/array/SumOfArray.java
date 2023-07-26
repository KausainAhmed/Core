package array;

import java.lang.foreign.ValueLayout.OfAddress;

public class SumOfArray {
public static void main(String[] args) {
	int ar[]= {2,3,4,5,6};
	int sum=0;
	for(int i=0;i<ar.length;i++) {

   sum+=ar[i];}
System.out.println("Sum of array = "+sum);
}
}

