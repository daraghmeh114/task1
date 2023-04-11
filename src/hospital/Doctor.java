
package hospital;

import java.util.Scanner;

public class Doctor {
    
    public void checkPatient() {
        System.out.println("Checking patient");
    }
    
    public void prescribeMedicine() {
        System.out.println("Prescribing medicine");
    }
    
    public void diagnose() {
        System.out.println("Diagnosing patient");
    }
    
static Scanner ii =new Scanner (System.in);
public  static String name(){
    System.out.println("enter your name");
    String n=ii.nextLine();
   return n;
}

public  static  int id(){
    System.out.println("enter your id");
   int i=ii.nextInt();
   return i;
}
public  static  float age(){
    System.out.println("enter your age");
  float a=ii.nextFloat();
   return a;
}

}
