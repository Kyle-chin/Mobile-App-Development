package Worksheet0;

public class EquilateralTriangle extends Triangle {
    private double side;
    private double perimeter; 

    public EquilateralTriangle(){}

    public EquilateralTriangle(String EquilateralTriangle){
        super(EquilateralTriangle);
    }

    public void setDimensions(double side){
        this.side = side;
        this.perimeter = side*3;
    }

    @Override
    public void printDimensions(){
        System.out.println("The sides: " + side);
    }

    @Override
    public double getArea(){
        double s = perimeter*(.5);
        return Math.sqrt(s*(s-side)*(s-side)*(s-side)); 
    }
}
