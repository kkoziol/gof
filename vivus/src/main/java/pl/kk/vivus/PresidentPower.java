package pl.kk.vivus;

import pl.kk.vivus.AcceptancePower;

public class PresidentPower extends AcceptancePower {
    
	@Override
	protected double getMaxAllowedAmount() {
		return 60000;
	}

	@Override
	protected String getRoleName() {
		return "Prezes Providenta";
	}
}