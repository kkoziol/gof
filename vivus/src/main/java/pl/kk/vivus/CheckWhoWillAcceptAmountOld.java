package pl.kk.vivus;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class CheckWhoWillAcceptAmountOld {

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println("Zapytaj Mr. Hi's ile może ci dać:");
                System.out.print(">");
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());

                processRequest(new LoanRequest(d, "na waciki"));

//                System.out.println("Masz jakieś nie spłacone pożyczki?:");
//                System.out.print("[t/n]>");
//                String answer = new BufferedReader(new InputStreamReader(System.in)).readLine();
//                if (answer.equalsIgnoreCase("t")) {
//                    processRequest(new LoanRequest(d, "na waciki", true));
//                } else {
//                    processRequest(new LoanRequest(d, "na waciki", false));
//                }
            }
        } catch (Exception exc) {
            System.exit(1);
        }
    }

    private static void processRequest(LoanRequest naWaciki) {
        if (naWaciki.getAmount() < 500) {
            System.out.println("Mr. Hi's odpowiada: " + zrobBardzoSkomplikowanaAnalizeFinansowa(naWaciki.getAmount()));
        } else if (naWaciki.getAmount() < 1000) {
            System.out.println("Mr. BranchManager odpowiada: " + zrobBardzoSkomplikowanaAnalizeFinansowa(naWaciki.getAmount()));
        } else if (naWaciki.getAmount() < 5000) {
            System.out.println("Mr. DistrictManager odpowiada: " + zrobBardzoSkomplikowanaAnalizeFinansowa(naWaciki.getAmount()));
        } else if (naWaciki.getAmount() < 10_000) {
            System.out.println("Mr. RegionalManager odpowiada: " + zrobBardzoSkomplikowanaAnalizeFinansowa(naWaciki.getAmount()));
        } else if (naWaciki.getAmount() < 50_000) {
            System.out.println("Mr. President odpowiada: " + zrobBardzoSkomplikowanaAnalizeFinansowa(naWaciki.getAmount()));
        } else {
            System.out.println("Mr. Hi's odpowiada: Nie pożyczamy tyle");
        }
    }

    private static String zrobBardzoSkomplikowanaAnalizeFinansowa(double amount) {
        if (new Random().nextBoolean()) {
            return "ok";
        } else {
            return "nie";
        }
    }
}