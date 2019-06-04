package pl.kk.vivus;

public class MrHis extends AcceptancePower {
    
	@Override
	protected double getMaxAllowedAmount() {
		return 500;
	}

	@Override
	protected String getRoleName() {
		return "Mr. Hi's";
	}
}