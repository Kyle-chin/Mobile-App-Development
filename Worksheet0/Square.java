package Worksheet0;

public class Square extends Shape {
    private double length;
    private double height;
    
    public Square(){}

    public Square(String Square){
        super(Square);      
    }

    public void setDimensions(double length, double height){
        this.length = length;
        this.height = height;
    }
    
    @Override
    public void printDimensions(){
        System.out.println("Length: " + length);
        System.out.println("Height: " + height);
    }

    @Override
    public double getArea(){
        return height * length;  
    }
}
