package fi.academy;

import java.util.Scanner;

public class KayttajanSyote {

    static int vastaus;

    public static void kysyKayttajalta() {
        // Kysyy käyttäjältä syötettä
        System.out.println("Valitse oikea vastaus vaihtoehdoista 1 tai 2: ");
        Scanner lukija = new Scanner(System.in);
        vastaus = Integer.parseInt(lukija.nextLine());
        if (!(vastaus == 1 || vastaus == 2)) {
            System.out.println("Voit valita vain 1 tai 2.\n" +
                    "Anna vastauksesi: ");
            vastaus = Integer.parseInt(lukija.nextLine());
        }
        System.out.println("Vastasit " + vastaus);
    }

    public static int getVastaus() {
        return vastaus;
    }
}
