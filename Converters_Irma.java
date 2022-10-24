package dayoneexample;
import java.util.Scanner;


public class DayOneExample {
    public static void main(String[] args) {
        Scanner keyboard_reader = new Scanner(System.in);
        
        // inches to cm
        System.out.println("Enter a number of inches: ");
        double inches = keyboard_reader.nextDouble();
        double cm_per_inch = 2.54;
        double cm = inches * cm_per_inch;
        System.out.println("That is  " + cm + " cm");
        
        // pounds to kg
        System.out.println("Enter a number of pounds: ");
        double pounds = keyboard_reader.nextDouble();
        double kg = pounds / 2.2046;
        System.out.println("That is  " + kg + " kg");

        //miles to km
        System.out.println("Enter a number of miles: ");
        double miles = keyboard_reader.nextDouble();
        double km = miles * 1.609344;
        System.out.println("That is  " + km + " kilometers");
        
        //fahrenheit to celsius
        System.out.println("Enter a number of fahrenheits: ");
        double fahr = keyboard_reader.nextDouble();
        double celsius = (fahr - 32) / 1.8;
        System.out.println("That is  " + celsius + " celsius");
        
        //miles per hours
        System.out.println("Enter a number of miles per hour: ");
        double milesph = keyboard_reader.nextDouble();
        double feetps = milesph * 1.466667;
        System.out.println("That is  " + feetps + " feet per second");
        
        
    }
    
}

//Irma Preldzic
