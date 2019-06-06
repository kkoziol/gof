package pl.kk.vivus;

import pl.kk.vivus.AcceptancePower;

public class BranchManagerPower extends AcceptancePower {
    
	@Override
	protected double getMaxAllowedAmount() {
		return 1_000;
	}

	@Override
	protected String getRoleName() {
		return "Kierownik Oddziału";
	}
}