package pl.kk.vivus;

import pl.kk.vivus.AcceptancePower;

public class DistrictManagerPower extends AcceptancePower {
    
	@Override
	protected double getMaxAllowedAmount() {
		return 5000;
	}

	@Override
	protected String getRoleName() {
		return "Dyrektor Okręgu";
	}
}