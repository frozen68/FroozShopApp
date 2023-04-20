
package controller;

import modell.IO;
import modell.Display;
import controller.DisplayController;
import controller.EinloggenController;
import static controller.EinloggenController.username;
import java.util.*;

public class AdminPanelCotroller {
    DisplayController dpc = new DisplayController();
    Display dp = new Display();
    EinloggenController ec = new EinloggenController();
    public AdminPanelCotroller(){
        
    }
    public void changePassword(){
        while (true) {
            
            System.out.println("Möchten Sie Ihre Password wechseln (J/N)?");
            String jaNeString = IO.in.next();
            if (jaNeString.equalsIgnoreCase("J")) {
                chPass();
                
            }
            if (jaNeString.equalsIgnoreCase("N")) {
                System.out.println("Viel Glück.\n " + "Vielen Dank für Ihren Besuch auf unserer Website.");
                dpc.mainMenu();
            } 
                break;
            
        }
    }
    public void chPass(){
        System.out.println("Username: ");
        ec.username.add(IO.in.next());
        
        System.out.println("Letzte Password: ");
        ec.password.remove(IO.in.next());
        
        System.out.println("Neue Password: ");
        ec.passwordR.add(IO.in.next());
        
        System.out.println("\n");
        dpc.mainMenu();
                
        
    }
}
