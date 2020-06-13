import java.io.*;
 import java.util.*;
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 

public class Pet {
   
    protected String  name="";
    protected int age=0;
    private int ageMultiplier=1;
   
    public Pet(String someName, int someAge) {
         name=someName;
         age=someAge;
    }
   public Pet(String someName, int someAge,int someMultiplier) {
        
         name=someName;
         age=someAge;
         ageMultiplier=someMultiplier;
    }

    public String selfDescribe() {
        
        return "Hello, my name is "+name+". I am "+calculateRealAge()+" in human year(s) old.";
    }
   
   public int calculateRealAge(){
       return age*ageMultiplier;
    }
   
}
