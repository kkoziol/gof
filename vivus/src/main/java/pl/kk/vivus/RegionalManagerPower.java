package pl.kk.vivus;

import pl.kk.vivus.AcceptancePower;

public class RegionalManagerPower extends AcceptancePower {
    
	@Override
	protected double getMaxAllowedAmount() {
		return 10_000;
	}

	@Override
	protected String getRoleName() {
		return "Menadzer regionu";
	}
}