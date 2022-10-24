package geometricfunctions_irma;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class GeometricFunctions_Irma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Area of a rectangle
        System.out.println("Area of a rectangle");
        System.out.println("Rectangle h: ");
        double rectangle_height = input.nextDouble();
        System.out.println("Rectangle w: ");
        double rectangle_width = input.nextDouble();
        double area_rectangle = rectangle_height * rectangle_width;
        System.out.println("Area: " + area_rectangle);
        
        //Area of a rectangle
        System.out.println("Area of a square");
        System.out.println("Square side: ");
        double square_side = input.nextDouble();
        double area_square = square_side * square_side;
        System.out.println("Area: " + area_square);
        
        //Volume of a cube
        System.out.println("Volume of a cube");
        System.out.println("Cube edge: ");
        double cube_edge = input.nextDouble();
        double volume_cube = cube_edge * cube_edge * cube_edge;
        System.out.println("Volume: " + volume_cube);

        //Area of a triangle
        System.out.println("Area of a triangle");
        System.out.println("Triangle w: ");
        double triangle_width = input.nextDouble();
        System.out.println("Triangle h: ");
        double triangle_height = input.nextDouble();
        double area_triangle =  (triangle_width * triangle_height)/2;
        System.out.println("Area: " + area_triangle);
        
        //Area of a circle
        System.out.println("Area of a circle");
        System.out.println("Circle radius: ");
        double circle_radius = input.nextDouble();
        double area_circle = 3.14159 * (circle_radius * circle_radius);
        System.out.println("Area: " + area_circle);
        
        //***Extra credit***
        //Area of a circle given diameter
        System.out.println("Area of a circle given diameter");
        System.out.println("Circle diameter: ");
        double circle_diameter = input.nextDouble();
        double fr = circle_diameter / 2;
        double area_circle_diameter = 3.1415 * (circle_diameter * circle_diameter);
        System.out.println("Area: " + area_circle_diameter);
        
        
        //Lenght of a hypotenuse
        System.out.println("Length of the hypotenuse");
        System.out.println("Leg 1:");
        double leg1 = input.nextDouble();
        System.out.println("Leg 2: ");
        double leg2 = input.nextDouble();
        double length_hy = sqrt((leg1 * leg1) + (leg2 * leg2));
        System.out.println("Length of the hypotenuse: " + length_hy);
        
        //Leg of a right traingle
        System.out.println("Leg of a right triangle");
        System.out.println("Other leg:");
        double other_leg = input.nextDouble();
        System.out.println("Hypotenuse: ");
        double hypotenuse = input.nextDouble();
        double length_other_leg = sqrt((hypotenuse * hypotenuse) - (other_leg * other_leg));
        System.out.println("Length of the other leg: " + length_other_leg);

        
    }
    
}

//Irma Preldzic
