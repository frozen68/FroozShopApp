package modell;

public class Display {

    //atrr
    Integer[] hmenuNum = {1, 2, 3, 4, 5};
    String[] hmenuPunk = {"Einloggen", "Shop", "KundenService", "AdminPanel", "beenden"};

    Integer[] loginSubmenuNum = {1, 2, 3, 4};
    String[] loginSubmenuPunk = {"Registrieren", "Als Gast", "Einloggen", "zurück"};

    Integer[] shopmenuNum = {1, 2, 3, 4};
    String[] shopmenuPunk = {"Herren", "Damen", "Kindern", "zurück"};

    Integer[] kundenServiceMenuNum = {1, 2, 3, 4};
    String[] kundenServiceMenuPunk = {"LoginProbleme", "RattenZahlen", "AndereProblem", "zurück"};

    Integer[] adminPanelMenuNum = {1, 2};
    String[] adminPanelMenuPunk = {"Chance Password", "zurück"};

    public void hMenuShow() {
        for (int i = 0; i < hmenuNum.length; i++) {
            System.out.println(hmenuNum[i] + ". " + hmenuPunk[i]);
        }

    }

    public void loginMenuShow() {
        for (int i = 0; i < loginSubmenuNum.length; i++) {
            System.out.println(loginSubmenuNum[i] + ". " + loginSubmenuPunk[i]);
        }

    }

    public void shopmenuNum() {
        for (int i = 0; i < shopmenuNum.length; i++) {
            System.out.println(shopmenuNum[i] + ". " + shopmenuPunk[i]);
        }

    }

    public void kundenServiceMenuShow() {
        for (int i = 0; i < kundenServiceMenuNum.length; i++) {
            System.out.println(kundenServiceMenuNum[i] + ". " + kundenServiceMenuPunk[i]);
        }
    }

    public void adminPanelMenuShow() {
        for (int i = 0; i < adminPanelMenuNum.length; i++) {
            System.out.println(adminPanelMenuNum[i] + ". " + adminPanelMenuPunk[i]);
        }
    }

}
