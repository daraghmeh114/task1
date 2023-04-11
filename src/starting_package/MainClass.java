package starting_package;

import java.util.Scanner;
import hospital.Doctor;

public class MainClass {

    public static void main(String[] args) {

        System.out.println("Select your type \n1 : Doctor\n2 : Nurse \n3 : Patient");
        Scanner input = new Scanner(System.in);
        Doctor d = new Doctor();
        String options = input.nextLine();
        switch (options) {
            case "1":
                d.checkPatient();
                break;
            case "2":
                d.prescribeMedicine();
                break;
            case "3":
                d.diagnose();
                break;
            default:
                System.out.println("select from options");
            }
    }
}



