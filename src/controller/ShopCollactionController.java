package controller;

import modell.ShopCollaction;
import modell.IO;
import java.util.regex.*;
import controller.DisplayController;


public class ShopCollactionController {

    String wahl;
    ShopCollaction sc = new ShopCollaction();
    

    public ShopCollactionController() {

    }

    public void herren() {
        do {
            System.out.println("Auswahl:\n1.Kleidung Menu Herren \n2.Accessoires Menu Herren");
            wahl = IO.in.next();
            switch (wahl) {
                case "1":
                    new modell.ShopCollaction().kleidungmenuHerren();
                    break;
                case "2":
                    new modell.ShopCollaction().accessoiresmenuHerren();
                    break;
                
                default:
                    System.out.println("");
                    break;
            }
        } while (1 == 2);

    }

//    static void kleidungmenuHerren() {
//
//        new ShopCollaction().kleidungmenuHerren();
//       
//    }
//
//    static void accessoiresmenuHerren() {
//        new ShopCollaction().accessoiresmenuHerren();
//    }

    public void damen() {
        do {
            System.out.println("Auswahl:\n1.Kleidung Menu Damen \n2.Accessoires Menu Damen");
            wahl = IO.in.next();
            switch (wahl) {
                case "1":
                    new ShopCollaction().kleidungmenuDamen();
                    break;
                case "2":
                    new ShopCollaction().accessoiresmenuDamen();
                    break;
                default:
                    System.out.println("");
                    break;
            }
        } while (1 != 2);

    }

//    static void kleidungmenuDamen() {
//        new ShopCollaction().kleidungmenuDamen();
//
//    }
//
//    static void accessoiresmenuDamen() {
//        new ShopCollaction().accessoiresmenuDamen();
//
//    }

    public void kindern() {
        do {
            System.out.println("Auswahl:\n1.Kleidung Menu Kindern \n2.Accessoires Menu Kindern");
            wahl = IO.in.next();
            switch (wahl) {
                case "1":
                    new ShopCollaction().kleidungmenuKindern();
                    break;
                case "2":
                    new ShopCollaction().accessoiresmenuKinder();
                    break;
                default:
                    System.out.println("");
                    break;
            }
        } while (1 != 2);

    }

//    static void kleidungmenuKindern() {
//        new ShopCollaction().kleidungmenuKindern();
//
//    }
//
//    static void accessoiresmenuKinder() {
//        new ShopCollaction().accessoiresmenuKinder();
//
//    }
}
