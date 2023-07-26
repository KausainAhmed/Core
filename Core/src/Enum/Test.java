package Enum;

public class Test {
public static void main(String[] args) {
	PaymentType pt=PaymentType.CREDICARD;
	//System.out.println(pt);
	
	PaymentType p[]=PaymentType.values();
	for(PaymentType s:p) {
		System.out.println(s+" "+s.ordinal()+" "+s.getFee());
		//System.out.println(s.fee);
	}
	//s prints values
	// ordinal methods prints index
	// s.fee prints values
	
}
}
