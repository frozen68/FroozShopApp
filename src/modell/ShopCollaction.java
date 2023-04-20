package modell;

import controller.DisplayController;
import java.util.*;

public class ShopCollaction {

    DisplayController dpc = new DisplayController();

    Integer[] shopmenuNum = {1, 2, 3, 4};
    String[] shopmenuPunk = {"Herren", "Damen", "Kindern", "zurück"};
//    Double [] djkd = {1,2,3,4,7};

//    Integer[] kleidungmenuNum = {1, 2, 3, 4, 5, 6, 7};
    String[] kleidungmenuPunk = {"Hose", "Jeans", "Bluse", "Hemd", "Shorts", "Tshirt", "Top"};
    double costKleidungDamen[] = {345.99, 215.65, 80.49, 75.99, 74.95, 45.55, 35.00};
    double costKleidungHerren[] = {299.99, 165.65, 65.49, 70.99, 69.95, 45.55, 30.00};
    double costKleidungKindern[] = {199.99, 89.65, 35.49, 30.99, 35.95, 20.55, 15.50};

//    Integer[] accessoiresmenuNum = {1, 2, 3, 4, 5, 6};
    String[] accessoiresmenuPunk = {"Uhr", "Cap", "Rucksack", "Portmoni", "Unterhose", "Unterhemd"};
    double costAccessoiresDamen[] = {345.99, 50.65, 120.49, 89.99, 20.95, 20.55};
    double costAccessoiresHerren[] = {345.99, 50.65, 120.49, 89.99, 25.95, 30.55};
    double costAccessoiresKindern[] = {145.99, 20.65, 80.49, 21.99, 10.95, 10.55};

//    public static ArrayList<String>summeHK;
//    public static ArrayList<String>summeHA;
//    public static ArrayList<String>summeDK;
//    public static ArrayList<String>summeDA;
//    public static ArrayList<String>summeKK;
//    public static ArrayList<String>summeKA;
//    public static ArrayList<String>summe;
    double buy[];
    float summeHK;
    float summeHA;
    float summeDK;
    float summeDA;
    float summeKK;
    float summeKA;
    float summe;
    double summeS;
    boolean weiter = false;
    int wahl;
    double rest;
    double geld;

    public void kleidungmenuHerren() {
        System.out.println(".\n ");
        do {
            itemsHerrenkleidung();
            System.out.print("Auswahl: ");
            wahl = IO.in.nextInt();
            rechnenHerrenKleidung();
            if (wahl == 8) {
                weiter = true;
            }

        } while (!weiter);
        select();

    }

    public void rechnenHerrenKleidung() {
        buy = new double[costKleidungHerren.length + 1];
        for (int i = 0; i <= kleidungmenuPunk.length - 1; i++) {
            if (wahl == i) {
                for (double j = 0; j < costKleidungHerren.length - 1; j++) {
                    buy[costKleidungHerren.length - 1] = costKleidungHerren[i];
                }
            }
        }
        for (int i = 0; i <= kleidungmenuPunk.length - 1; i++) {
            summe += buy[i];
        }
        System.out.print("\n" + "Summe: " + summe + "€\n");
    }

    public void itemsHerrenkleidung() {
        for (int i = 1; i <= kleidungmenuPunk.length - 1; i++) {
            System.out.println(i+ ". " + kleidungmenuPunk[i] + " kostet " + costKleidungHerren[i] + " Euro");
        }
        System.out.println("8. Bezahlen Wählen");
    }

    public void accessoiresmenuHerren() {
        System.out.println(".\n ");
        do {
            itemsHerrenAccessoires();
            System.out.print("Auswahl: ");
            wahl = IO.in.nextInt();
            rechnenHerrenAccessoires();
            if (wahl == 7) {
                weiter = true;
            }

        } while (!weiter);
        select();

    }

    public void rechnenHerrenAccessoires() {
        buy = new double[costAccessoiresHerren.length + 1];
        for (int i = 0; i <= accessoiresmenuPunk.length - 1; i++) {
            if (wahl == i) {
                for (double j = 0; j < costAccessoiresHerren.length - 1; j++) {
                    buy[costAccessoiresHerren.length - 1] = costAccessoiresHerren[i];
                }
            }
        }
        for (int i = 0; i <= accessoiresmenuPunk.length - 1; i++) {
            summe += buy[i];
        }
        System.out.print("\n" + "Summe: " + summe + "€\n");
    }

    public void itemsHerrenAccessoires() {
        for (int i = 0; i <= accessoiresmenuPunk.length - 1; i++) {
            System.out.println(i + ". " + accessoiresmenuPunk[i] + " kostet " + costAccessoiresHerren[i] + " Euro");
        }
        System.out.println("7. Bezahlen Wählen");
    }

    public void kleidungmenuDamen() {
        System.out.println(".\n ");
        do {
            itemsDamenkleidung();
            System.out.print("Auswahl: ");
            wahl = IO.in.nextInt();
            rechnenDamenKleidung();
            if (wahl == 8) {
                weiter = true;
            }

        } while (!weiter);
        select();

    }

    public void rechnenDamenKleidung() {
        buy = new double[costKleidungDamen.length + 1];
        for (int i = 0; i <= kleidungmenuPunk.length - 1; i++) {
            if (wahl == i) {
                for (int j = 0; j < costKleidungDamen.length - 1; j++) {
                    buy[costKleidungDamen.length - 1] = costKleidungDamen[i];
                }
            }
        }
        for (int i = 0; i <= kleidungmenuPunk.length - 1; i++) {
            summe += buy[i];
        }
        System.out.print("\n" + "Summe: " + summe + "€\n");
    }

    public void itemsDamenkleidung() {
        for (int i = 0; i <= kleidungmenuPunk.length - 1; i++) {
            System.out.println(i + ". " + kleidungmenuPunk[i] + " kostet " + costKleidungDamen[i] + " Euro");
        }
        System.out.println("8. Bezahlen Wählen");
    }

    public void accessoiresmenuDamen() {
        System.out.println(".\n ");
        do {
            itemsDamenAccessoires();
            System.out.print("Auswahl: ");
            wahl = IO.in.nextInt();
            rechnenDamenAccessoires();
            if (wahl == 7) {
                weiter = true;
            }

        } while (!weiter);
        select();

    }

    public void rechnenDamenAccessoires() {
        buy = new double[costAccessoiresDamen.length + 1];
        for (int i = 0; i <= accessoiresmenuPunk.length - 1; i++) {
            if (wahl == i) {
                for (int j = 0; j < costAccessoiresDamen.length - 1; j++) {
                    buy[costAccessoiresDamen.length - 1] = costAccessoiresDamen[i];
                }
            }
        }
        for (int i = 0; i <= accessoiresmenuPunk.length - 1; i++) {
            summe += buy[i];
        }
        System.out.print("\n" + "Summe: " + summe + "€\n");
    }

    public void itemsDamenAccessoires() {
        for (int i = 0; i <= accessoiresmenuPunk.length - 1; i++) {
            System.out.println(i + ". " + accessoiresmenuPunk[i] + " kostet " + costAccessoiresDamen[i] + " Euro");
        }
        System.out.println("7. Bezahlen Wählen");
    }

    public void kleidungmenuKindern() {
        System.out.println(".\n ");
        do {
            itemsKindernkleidung();
            System.out.print("Auswahl: ");
            wahl = IO.in.nextInt();
            rechnenKinderKleidung();
            if (wahl == 8) {
                weiter = true;
            }

        } while (!weiter);
        select();

    }

    public void rechnenKinderKleidung() {
        buy = new double[costKleidungKindern.length + 1];
        for (int i = 0; i <= kleidungmenuPunk.length - 1; i++) {
            if (wahl == i) {
                for (int j = 0; j < costKleidungKindern.length - 1; j++) {
                    buy[costKleidungKindern.length - 1] = costKleidungKindern[i];
                }
            }
        }
        for (int i = 0; i <= kleidungmenuPunk.length - 1; i++) {
            summe += buy[i];
        }
        System.out.print("\n" + "Summe: " + summe + "€\n");
    }

    public void itemsKindernkleidung() {
        for (int i = 0; i <= kleidungmenuPunk.length - 1; i++) {
            System.out.println(i + ". " + kleidungmenuPunk[i] + " kostet " + costKleidungKindern[i] + " Euro");
        }
        System.out.println("8. Bezahlen Wählen");
    }

    public void accessoiresmenuKinder() {
        System.out.println(".\n ");
        do {
            itemsKindernAccessoires();
            System.out.print("Auswahl: ");
            wahl = IO.in.nextInt();
            rechnenKinderAccessoires();
            if (wahl == 7) {
                weiter = true;
            }

        } while (!weiter);
        select();
        
    }

    public void rechnenKinderAccessoires() {
        buy = new double[costAccessoiresKindern.length + 1];
        for (int i = 0; i <= accessoiresmenuPunk.length - 1; i++) {
            if (wahl == i) {
                for (int j = 0; j < costAccessoiresKindern.length - 1; j++) {
                    buy[costAccessoiresKindern.length - 1] = costAccessoiresKindern[i];
                }
            }
        }
        for (int i = 0; i <= accessoiresmenuPunk.length - 1; i++) {
            summe += buy[i];
        }
        System.out.print("\n" + "Summe: " + summe + "€\n");
    }

    public void itemsKindernAccessoires() {
        for (int i = 0; i <= accessoiresmenuPunk.length - 1; i++) {
            System.out.println(i + ". " + accessoiresmenuPunk[i] + " kostet " + costAccessoiresKindern[i] + " Euro");
        }
        System.out.println("7. Bezahlen Wählen");
    }

    public void select() {
        System.out.println("Möchten Sie weiter Einkaufen? (J/N)?");
        String jaNeString = IO.in.next();
        if (jaNeString.equalsIgnoreCase("J")) {
            dpc.shopMenuNum();

        }
        if (jaNeString.equalsIgnoreCase("N")) {
            bezahlen();
        }
    }

    public void bezahlen() {

        while (true) {
            
            System.out.println("Sie haben es für " + summe + " Euro gekauft.");
            
            if (summe == 500) {
                summeS = summe - ((summe - 20) / 100);
                System.out.print("Sie haben 20% Rabatt." + "\n" + " Sie müssen " + summeS + " Euro zahlen");
            }
            if (summe > 500) {
                summeS = summe - ((summe - 30) / 100);
                System.out.print("Sie haben 30% Rabatt." + "\n" + " Sie müssen " + summeS + " Euro zahlen");
            }
            if (summe < 500) {
                summeS = summe - ((summe - 10) / 100);
                System.out.print("Sie haben 10% Rabatt." + "\n" + " Sie müssen " + summeS + " Euro zahlen");
            }

            System.out.println("Möchten Sie Raten Zahlen? (J/N)?");
            String jaNeString = IO.in.next();
            if (jaNeString.equalsIgnoreCase("J")) {
                new controller.KundenServiceController().rattenZahlen();

            }
            if (jaNeString.equalsIgnoreCase("N")) {
                System.out.print("Danke für Ihren Einkauf. Der Preis Ihrer Ware beträgt " + summeS + " Euro");
            }
            break;
        }
    }

}
