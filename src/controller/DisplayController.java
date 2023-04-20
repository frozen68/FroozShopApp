package controller;

import java.util.*;
import modell.ShopCollaction;
import modell.Display;
import modell.IO;
import controller.AdminPanelCotroller;

public class DisplayController {

    Display dp = new Display();
//    ShopCollactionController scc = new ShopCollactionController();
//    AdminPanelCotroller apc = new AdminPanelCotroller();
    boolean weiter = true;
    String wahl;

    public DisplayController() {
    }

    //Methode hauptmenu
    public void mainMenu() {
        do {
            dp.hMenuShow();
            System.out.println("Auswahl:");
            wahl = IO.in.next();
            switch (wahl) {
                case "1":
                    loginMenu();
                    weiter = true;
                    break;
                case "2":
                    shopMenuNum();
                    weiter = true;
                    break;
                case "3":
                    kundenServiceMenuNum();
                    weiter = true;
                    break;
                case "4":
                    adminPanelMenuNum();
                    weiter = true;
                    break;
                case "5":
                    beenden();
                    break;
                default:
                    System.out.println("Falsch!!!");
                    break;
            }

        } while (weiter);
    }

    //SubMenu
    public void loginMenu() {
        do {

            dp.loginMenuShow();
            System.out.println("Auswahl:");
            wahl = IO.in.next();
            switch (wahl) {
                case "1":
                    new EinloggenController().registrieren();
                    break;
                case "2":
                    new EinloggenController().alsGast();
                    break;
                case "3":
                    new EinloggenController().einloggen();
                    break;
                case "4":
                    weiter = false;
                    break;
                default:
                    System.out.println("Falsch!!!");
                    break;
            }

        } while (weiter);
    }

    public void shopMenuNum() {
        do {
            dp.shopmenuNum();
//            shc.shopmenuNum();
            System.out.println("Auswahl:");
            wahl = IO.in.next();
            switch (wahl) {
                case "1":
                    new ShopCollactionController().herren();
                    break;
                case "2":
                    new ShopCollactionController().damen();
                    break;
                case "3":
                    new ShopCollactionController().kindern();
                    break;
                case "4":
                    weiter = false;
                    break;
                default:
                    System.out.println("Falsch!!!");
                    break;
            }

        } while (weiter);
    }

    public void kundenServiceMenuNum() {
        do {
            dp.kundenServiceMenuShow();
//            shc.shopmenuNum();
            System.out.println("Auswahl:");
            wahl = IO.in.next();
            switch (wahl) {
                case "1":
                    new controller.KundenServiceController().logProblem();
                    break;
                case "2":
                    new controller.KundenServiceController().rattenZahlen();
                    break;
                case "3":
                    new controller.KundenServiceController().andereProblem();
                    break;
                case "4":
                    weiter = false;
                    break;
                default:
                    System.out.println("Falsch!!!");
                    break;
            }

        } while (weiter);
    }

    public void adminPanelMenuNum() {
        do {
            dp.adminPanelMenuShow();
//            shc.shopmenuNum();
            System.out.println("Auswahl:");
            wahl = IO.in.next();
            switch (wahl) {
                case "1":
                    new AdminPanelCotroller().changePassword();
                    break;
                case "2":
                    weiter = false;
                    break;
                default:
                    System.out.println("Falsch!!!");
                    break;
            }

        } while (weiter);
    }

    public void beenden() {
        System.exit(0);
    }

//    static void registrieren() {
//        
//    }
//
//    static void alsGast() {
//
//    }
//
//    static void einloggen() {
//        
//    }
//    static void herren(){
//        
//    }
//    static void damen(){
//        
//    }
//    static void kindern(){
//        
//    }
}
