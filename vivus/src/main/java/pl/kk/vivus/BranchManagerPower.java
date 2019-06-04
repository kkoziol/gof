package pl.kk.vivus;

import pl.kk.vivus.AcceptancePower;

public class BranchManagerPower extends AcceptancePower {
    
	@Override
	protected double getMaxAllowedAmount() {
		return 500;
	}

	@Override
	protected String getRoleName() {
		return "Kierownik Oddziału";
	}
}