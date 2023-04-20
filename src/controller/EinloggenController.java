package controller;

import modell.Einloggen;
import java.lang.*;
import java.util.*;
import modell.IO;
import controller.KundenServiceController;
import controller.DisplayController;
import static java.lang.System.out;

public class EinloggenController {

//    Einloggen el = new Einloggen();
//    KundenServiceController ksc = new KundenServiceController();
    DisplayController dpc = new DisplayController();
    public String[] jaNe = {"J ", "j", "ja", "Ja", "JA", " N", " n", "nein", "NEIN", "Nein"};
    Random rand = new Random();
    public static ArrayList<String> name;
//    public static ArrayList<String> gebustjahr;
    public static ArrayList<String> password;
    public static ArrayList<String> passwordR;
    public static ArrayList<String> username;
    public static ArrayList<String> handynumb;
    public static ArrayList<String> email;
    public static ArrayList<String> blockList;
    static String code;
    public static char c;
    public boolean nEmail = false;
    public boolean nlength = false;
//    public int rand = 999999;

//    String antwort;
//    public EinloggenController() {
//
//    }
    public void registrieren() {

        Date de = new Date();
        de.getTime();
        name = new ArrayList<>();
        password = new ArrayList<>();
        username = new ArrayList<>();
//        gebustjahr = new ArrayList<>();
        handynumb = new ArrayList<>();
        email = new ArrayList<>();
        blockList = new ArrayList<>();
        passwordR = new ArrayList<>();
//        menueEingabe = IO.input.next();
//        erstellterUser = menueEingabe;

        System.out.print("Name: ");
        name.add(IO.in.next());
//        el.setName(name)       

        System.out.print("Username: ");
        username.add(IO.in.next());
//        el.setUserName(userName);

        System.out.print("Passowrd: ");
        password.add(IO.in.next());
        //        el.setPassword(pAssword);
//        do {
//            code = IO.in.next();
//            if (code.length() < 8) {
//                System.out.println("Die Anzahl der Passwortcodes sollte nicht weniger als 8 betragen.");
//            }
//        } while (code.length() >= 8);

        System.out.print("Email:  ");
        email.add(IO.in.next());
//        el.setEmail(emailId);

        System.out.print("Handy Nummer:  ");
        handynumb.add(IO.in.next());
//        el.setPhoneNumb(phoneNumb);

//        System.out.println(el.toString());
    }

    public void alsGast() {
        while (true) {

            System.out.println("Möchten Sie als Gast einkaufen (J/N)?");
            String jaNeString = IO.in.next();
            if (jaNeString.equalsIgnoreCase("J")) {
                new controller.DisplayController().shopMenuNum();

            }
            if (jaNeString.equalsIgnoreCase("N")) {
                new controller.DisplayController().loginMenu();
            } else {
                System.out.println("Error!!");
                break;
            }
        }

    }

    public void einloggen() {

        System.out.print("Username: ");
        username.add(IO.in.next());
//        el.setUserName(userName);

        System.out.print("Passowrd: ");
        password.add(IO.in.next());
//        el.setPassword(password);

        dpc.mainMenu();

//      
    }

//   
}
