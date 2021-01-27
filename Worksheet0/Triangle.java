package Worksheet0;

public class Triangle extends Shape {
    private double first;
    private double second;
    private double third;
    private double perimeter; 

    public Triangle(){}

    public Triangle(String Triangle){
        super(Triangle);
    }

    public void setDimensions(double first, double second, double third){
        this.first = first;
        this.second = second;
        this.third = third;
        this.perimeter = first + second + third;
    }

    @Override
    public void printDimensions(){
        System.out.println("First side: " + first);
        System.out.println("Second side: " + second);
        System.out.println("Third side: " + third);
    }

    @Override
    public double getArea(){
        double s = perimeter*(.5);
        return Math.sqrt(s*(s-first)*(s-second)*(s-third)); 
    }
}
