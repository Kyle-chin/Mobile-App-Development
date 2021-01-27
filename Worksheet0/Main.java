package Worksheet0;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create scanner
        Scanner in = new Scanner(System.in);
        // create instance of each class
        Square s = new Square("square");
        Circle c = new Circle("circle");
        Triangle t = new Triangle("triangle");
        EquilateralTriangle eq = new EquilateralTriangle("EQtriangle");
        
        //prompt user - Square
        System.out.println("Please Enter the Length of the Square: ");
        double length = in.nextDouble();
        System.out.println("Please Enter the Height of the Square: ");
        double height = in.nextDouble();
        s.setDimensions(length, height);

        //prompt user - Circle
        System.out.println("Please Enter the Radius of the Circle: ");
        double Radius = in.nextDouble();
        c.setDimensions(Radius);

        //prompt user - Triangle
        System.out.println("Please Enter the first side of the triangle: ");
        double first = in.nextDouble();
        System.out.println("Please Enter the second of the triangle: ");
        double second = in.nextDouble();
        System.out.println("Please Enter the third of the triangle: ");
        double third = in.nextDouble();
        t.setDimensions(first, second, third);

        //prompt user - EQTriangle
        System.out.println("Please Enter the Side of the Equilateral Triangle: ");
        double side = in.nextDouble();
        eq.setDimensions(side);

        
        System.out.println(s.getName() + " + area " + s.getArea());
        s.printDimensions();

        System.out.println(c.getName() + " + area " + c.getArea());
        c.printDimensions();

        System.out.println(t.getName() + " + area " + t.getArea());
        t.printDimensions();

        System.out.println(eq.getName() + " + area " + eq.getArea());
        eq.printDimensions();

        in.close();
    }

}
