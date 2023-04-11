
package starting_package;

import java.util.Scanner;

public class patient {

static Scanner in =new Scanner (System.in);
public  static String name(){
    System.out.println("enter your name");
    String n=in.nextLine();
   return n;
}

public  static  int id(){
    System.out.println("enter your id");
   int i=in.nextInt();
   return i;
}
public  static  float age(){
    System.out.println("enter your age");
  float a=in.nextFloat();
   return a;
}

}
