package modell;

import java.io.Console;
import java.lang.*;
import java.util.*;
import controller.EinloggenController;

public class Einloggen {

    public double input;
    public double output;
    public String Name;
    public String UserName;
    public String Password;
    public String Email;
    public long phoneNumb;
    
//    public static char c;
//    public boolean nEmail = false;
//    public boolean nlength = false;
//    public int rand = 999999;
//    public boolean code = true;
    
    

    public Einloggen() {

    }

    public double getInput() {
        return input;
    }

    public void setInput(double input) {
        this.input = input;
    }

    public double getOutput() {
        return output;
    }

    public void setOutput(double output) {
        this.output = output;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        this.UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String pAssword) {
        this.Password = pAssword;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String emailId) {
        this.Email = emailId;
    }

    public long getPhoneNumb() {
        return phoneNumb;
    }

    public void setPhoneNumb(long phoneNumb) {
        this.phoneNumb = phoneNumb;
    }

//    @Override

//    public String toString() {
//        return "Register [Name : " + name +  ", Username : " + userName + ", Password : "
//                + password + ", Email : " + email + ", Handy : " + phoneNumb + "]";
//    }

//    public void setName(ArrayList<String> name) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

}
