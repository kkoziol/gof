package pl.kk.pilot;


import pl.kk.pilot.garaz.Garaz;
import pl.kk.pilot.swiatlo.Swiatlo;
import pl.kk.pilot.tv.Telewizor;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pilot {


    public Pilot() {
        System.out.println("-----> Rozpoczęcie pracy pilota <-----");
    }

    public void kliknijPrzyciskNr(String numer) {
        switch (numer) {
            case "1":
                new Swiatlo().wlacz();
                break;
            case "2":
                new Swiatlo().wylacz();
                break;
            case "3":
                new Garaz().drzwiGora();
                break;
            case "4":
                new Garaz().drzwiDol();
                break;
            case "5":
                new Telewizor().wlacz();
                break;
            case "6":
                new Telewizor().wylacz();
                break;
            case "7":
                new Telewizor().glosnoscPlus();
                break;
            case "8":
                new Telewizor().glosnoscMinus();
                break;
            case "9":
                new Telewizor().kanalPlus();
                break;
            case "0":
                new Telewizor().kanalMinus();
                break;
            default:
                System.out.println("Ale o co cho?");
        }
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
        System.out.println("1 - Swiatło on");
        System.out.println("2 - Swiatło off");
        System.out.println("3 - Garaz2 otwórz");
        System.out.println("4 - Garaz2 zamknij");
        System.out.println("5 - Telewizor2 on");
        System.out.println("6 - Telewizor2 off");
        System.out.println("7 - Telewizor2 głośniej");
        System.out.println("8 - Telewizor2 ciszej");
        System.out.println("9 - Telewizor2 następny kanał");
        System.out.println("0 - Telewizor2 poprzedni kanał");

    }

    public void przelaczMenu() {

    }
}
