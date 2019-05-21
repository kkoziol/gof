package pl.kk.pilot;


import pl.kk.pilot.comands.Command;
import pl.kk.pilot.comands.CommandMakro;
import pl.kk.pilot.comands.CommandPrzelaczMenu;
import pl.kk.pilot.comands.CommandZakoncz;
import pl.kk.pilot.comands.garaz.CommandGarazOtworzDrzwi;
import pl.kk.pilot.comands.garaz.CommandGarazZamknijDrzwi;
import pl.kk.pilot.comands.swiatlo.CommandSwiatloWlacz;
import pl.kk.pilot.comands.swiatlo.CommandSwiatloWylacz;
import pl.kk.pilot.comands.wentylator.*;
import pl.kk.pilot.garaz.Garaz;
import pl.kk.pilot.swiatlo.Swiatlo;
import pl.kk.pilot.tv.Telewizor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Pilot {

    private Map<String, Command> przyciski = new TreeMap<String, Command>();

    public Pilot() {
        System.out.println("-----> Rozpoczęcie pracy pilota <-----");
        przyciski.put("1", new CommandSwiatloWlacz());
        przyciski.put("2", new CommandSwiatloWylacz());
        przyciski.put("3", new CommandGarazOtworzDrzwi());
        przyciski.put("4", new CommandGarazZamknijDrzwi());
        przyciski.put("5", new CommandWentylatorWlacz());
        przyciski.put("6", new CommandWentylatorObroty1());
        przyciski.put("7", new CommandWentylatorObroty2());
        przyciski.put("8", new CommandWentylatorObroty3());
        przyciski.put("9", new CommandWentylatorWylacz());
        przyciski.put("0", new CommandMakro(przyciski.get("1"), przyciski.get("5")));
        przyciski.put("Z", new CommandZakoncz());


    }

    public void kliknijPrzyciskNr(String numer) {
        if (przyciski.get(numer) != null)
            przyciski.get(numer).execute();
    }

    private static boolean czyWcisnietoZnakWyjscia(String znak) {
        return !(znak.toUpperCase().equals("Z"));
    }

    public static void main(String[] args) {
        Pilot pilot = new Pilot();
        boolean czyDalej = true;
        String wybranyNr = null;

        do {
            System.out.println("");

            pilot.wyswietlMenu();
            System.out.println("-----> Wcisnij 'z' aby zakończyć <-----");
            System.out.print("Wybierz opcję: ");
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
                wybranyNr = br.readLine();
                System.out.println("");
                pilot.kliknijPrzyciskNr(wybranyNr);
                czyDalej = czyWcisnietoZnakWyjscia(wybranyNr);
            } catch (Exception e) {
                System.out.println("");
                System.out.println("Błędny wybór, spróbuj ponownie");
            }
        } while (czyDalej);
    }

    private void wyswietlMenu() {
        System.out.println("------>Menu<------");
        for (Map.Entry<String, Command> entry : przyciski.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue().getOpis());
        }

    }

    public void przelaczMenu() {

    }
}
