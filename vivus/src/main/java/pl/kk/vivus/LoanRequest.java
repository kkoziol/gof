package pl.kk.vivus;

public class LoanRequest {

	private double amount;
	private String purpose;
	private boolean haveOtherLoans;

	public LoanRequest(double amount, String purpose) {
		this.amount = amount;
		this.purpose = purpose;
	}

	public LoanRequest(double d, String na_waciki, boolean otherLoans) {
		this.amount = d;
		this.purpose = na_waciki;
		this.haveOtherLoans = otherLoans;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPurpose() {
		return this.purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public boolean isHaveOtherLoans() {
		return haveOtherLoans;
	}

	public void setHaveOtherLoans(boolean haveOtherLoans) {
		this.haveOtherLoans = haveOtherLoans;
	}
}