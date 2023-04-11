
package starting_package;

import java.util.Scanner;


public class nurse {

static Scanner ou =new Scanner (System.in);
public  static String name(){
    System.out.println("enter your name");
    String n=ou.nextLine();
   return n;
}

public  static  int id(){
    System.out.println("enter your id");
   int i=ou.nextInt();
   return i;
}
public  static  float age(){
    System.out.println("enter your age");
  float a=ou.nextFloat();
   return a;
}

}
    

