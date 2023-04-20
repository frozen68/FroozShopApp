package controller;

import java.text.NumberFormat;
import modell.IO;
import java.util.*;
import controller.EinloggenController;
import controller.DisplayController;

public class KundenServiceController {

    EinloggenController ec = new EinloggenController();
    DisplayController dpc = new DisplayController();

    static String code;
    static String login;
    static int codu;
    static int codn;
    static int zaehler = 2;
    static boolean block = false;

    public KundenServiceController() {

    }

    public void logProblem() {
        authen();

    }

    public void authen() {
        System.out.print("Benutzername: ");
        zaehler = 2;
        code = IO.in.next();
        login = code;
        kontrolBlockUser();
        if (block == true) {
            System.out.println("Zugriff verweigert. da " + login + " vom System gesperrt wurde");
        }
        for (int i = 0; i <= EinloggenController.username.size() - 1; i++) {
            if (code.equalsIgnoreCase(EinloggenController.username.get(i))) {
                System.out.println("Habe " + code + " in meiner Datenbank gefunden");
                code = login;

                do {
                    System.out.print("Passwort: ");
                    code = IO.in.next();
                    if (!(code.equalsIgnoreCase(EinloggenController.password.get(i)))) {
                        System.out.println("Error! Bitte versuchen Sie noch einmal!!");
                        zaehler--;
                        System.out.println("Sie können es noch " + zaehler + " Mal versuchen!");
                    }
                    if (zaehler == 0) {
                        System.out.println(" ");
                        userBlock();
                        logProblem();
                    }
                } while (!(code.equalsIgnoreCase(EinloggenController.password.get(i))));

                zaehler = 2;
                System.out.println("Passwort Korrekt");
                System.out.println("Bitte geben Sie den Ihnen zugesandten Sicherheitscode ein.");
                System.out.println("Ihr Code lautet : " + codo());

                do {
                    System.out.print("Bitte geben diesen nun ein: ");
                    codn = IO.in.nextInt();
                    if (!(codn == codu)) {
                        System.out.println("Error! Bitte versuchen Sie noch einmal!!");
                        zaehler--;
                        System.out.println("Sie können es noch " + zaehler + " Mal versuchen!");
                    }
                    if (zaehler == 0) {
                        System.out.println(" ");
                        userBlock();
                        logProblem();
                    }
                } while (!(codn == codu));

                System.out.println("\n");
                System.out.println("Korrekt! Vielen Dank!!");

            }
        }

        System.out.println("\n");
        System.out.println("Ihr Benutzername kann nicht gefunden werden!!!");
        retu();

    }

    public void userBlock() {
        EinloggenController.blockList.add(login);
        System.out.println("Ihr Konto wurde gesperrt.\n " + " Wir leiten Sie zum entsprechenden Abschnitte weite, \n " + " um Ihre Konto wiederherzustellen.");

        andereProblem();

    }

    public void kontrolBlockUser() {
        block = false;
        if (EinloggenController.blockList.size() > 0) {
            for (int i = 0; i <= EinloggenController.blockList.size() - 1; i++) {
                if (login.equalsIgnoreCase(EinloggenController.blockList.get(i))) {
                    block = true;
                }
            }
        }

    }

    public int codo() {
        double codoDouble = Math.random() * 100000;
        codoDouble = Math.round(100.0 * codoDouble) / 100.0;
        codu = (int) codoDouble;
        return codu;
    }

    public void rattenZahlen() {
        final byte Monate_Des_Jahres = 12;
        final byte PROZENT = 100;
        System.out.print("Ratenpreis: ");
        double ratenpreis = IO.in.nextInt();
        System.out.println("Jahreszinssatz: ");
        float jahreszinssatz = IO.in.nextFloat();
        float monthlyInterest = jahreszinssatz / PROZENT / Monate_Des_Jahres;
        System.out.println("Ratenjahre: ");
        byte ratenjahre = IO.in.nextByte();
        double numOfPayments = ratenjahre * Monate_Des_Jahres;
        double montgage = ratenpreis * (monthlyInterest * Math.pow(1 + monthlyInterest, numOfPayments))
                / (Math.pow(1 + monthlyInterest, numOfPayments) - 1);//tavan Math.pow
        String mortagaeFormatted = NumberFormat.getCurrencyInstance().format(montgage);
        System.out.println("Montazahlen: " + mortagaeFormatted);
    }

    public void andereProblem() {
        System.out.println("Bitte füllen Sie das folgende Formular aus.");

        System.out.println("Name: ");
        String name = IO.in.next();
        System.out.println("Email: ");
        String email = IO.in.next();
        System.out.println("Betreff: ");
        String betreff = IO.in.next();
        System.out.println("Ihre Nachricht: ");
        String nachricht = IO.in.next();
        System.out.println(" Wir werden Sie innerhalb von 3 Werktagen kontaktieren.");
        System.out.println("\n");
        retu();

    }
    public void retu(){
        while (true) {
            
            System.out.println("Möchten Sie zum Hauptmenü zurückkehren (J/N)?");
            String jaNeString = IO.in.next();
            if (jaNeString.equalsIgnoreCase("J")) {
                dpc.mainMenu();
                
            }
            if (jaNeString.equalsIgnoreCase("N")) {
                System.out.println("Viel Glück.\n " + "Vielen Dank für Ihren Besuch auf unserer Website.");
                dpc.beenden();
            } 
                break;
            
        }
    }
}
