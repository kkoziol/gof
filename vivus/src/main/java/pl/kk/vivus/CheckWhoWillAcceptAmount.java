package pl.kk.vivus;

import pl.kk.vivus.BranchManagerPower;
import pl.kk.vivus.DistrictManagerPower;
import pl.kk.vivus.PresidentPower;
import pl.kk.vivus.RegionalManagerPower;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckWhoWillAcceptAmount {

	public static void main(String[] args) {
		MrHis mrHis = new MrHis();
		BranchManagerPower manager = new BranchManagerPower();
		DistrictManagerPower director = new DistrictManagerPower();
		RegionalManagerPower regional = new RegionalManagerPower();
		PresidentPower president = new PresidentPower();
		mrHis.setSuccessor(manager);
		manager.setSuccessor(director);
		director.setSuccessor(regional);
		regional.setSuccessor(president);

		try {
			while (true) {
				System.out.println("Podaj kwotę wnioskowanej pozyczki:");
				System.out.print(">");
				double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
				mrHis.processRequest(new LoanRequest(d, "na waciki"));
			}
		} catch (Exception exc) {
			System.exit(1);
		}
	}
}