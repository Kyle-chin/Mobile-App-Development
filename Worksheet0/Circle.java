package Worksheet0;

public class Circle extends Shape {
    private double radius;

    public Circle(){}

    public Circle(String Circle){
        super(Circle);      
    }

    public void setDimensions(double radius){
        this.radius = radius;
    }

    @Override
    public void printDimensions(){
        System.out.println("Radius: " + radius);
    }

    @Override
    public double getArea(){
        return Math.PI*Math.pow(radius, 2); 
    }    
}
