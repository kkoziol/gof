package pl.kk.vivus;

public abstract class AcceptancePower {

	protected AcceptancePower successor;

	abstract protected double getMaxAllowedAmount();

	abstract protected String getRoleName();

	public void setSuccessor(AcceptancePower successor) {
		this.successor = successor;
	}

	public void processRequest(LoanRequest request) {
		if (request.getAmount() < this.getMaxAllowedAmount()) {
			System.out.println(this.getRoleName() + " zatwierdza kwotę: " + request.getAmount() + " pożyczki: "
					+ request.getPurpose());
		} else if (successor != null) {
			successor.processRequest(request);
		} else {
			System.out.println("Kwota za duża! Nie pożyczamy tyle!!");
		}
	}
}