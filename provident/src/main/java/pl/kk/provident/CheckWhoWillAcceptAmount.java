package pl.kk.provident;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckWhoWillAcceptAmount {

    public static void main(String[] args) {
        try {
            while (true) {
                System.out.println("Podaj kwotę wnioskowanej pozyczki:");
                System.out.print(">");
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                processRequest(new LoanRequest(d, "na waciki"));
            }
        } catch (Exception exc) {
            System.exit(1);
        }
    }

    private static void processRequest(LoanRequest naWaciki) {
        if (naWaciki.getAmount() < 500) {
            System.out.println("BranchManagerPower");
        } else if (naWaciki.getAmount() < 2000) {
            System.out.println("DistrictManagerPower");
        } else if (naWaciki.getAmount() < 30_000) {
            System.out.println("RegionalManagerPower");
        } else if (naWaciki.getAmount() < 60_000) {
            System.out.println("PresidentPower");
        }else{
            System.out.println("Nie pożyczamy tyle");
        }
    }
}