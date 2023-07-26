package Enum;

public enum PaymentType{
	DEBITCARD(4545),CREDICARD(8080),INHANDCASH(6987);
	int fee;

	private PaymentType(int fee) {
		this.fee = fee;
	}
	public int getFee() {
		return this.fee;
	}
}