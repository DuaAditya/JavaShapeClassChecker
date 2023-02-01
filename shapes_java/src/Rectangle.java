/*
A Rectangle class that extends PrintableObject and also implements Shape.
 */


public class Rectangle extends PrintableObject implements Shape {


    // Sides of the rectangle.
    private double sideOne;
    private double sideTwo;

    //Constructors
    public Rectangle(){}

    public Rectangle(double sideOne, double sideTwo){
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    //Getters and setters.
    public double getSideOne() {
        return sideOne;
    }
    public double getSideTwo() {
        return sideTwo;
    }
    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }
    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    //toString method
    @Override
    public String toString() {
        return getName() +
                " with first side = " + sideOne +
                " and second side = " + sideTwo;
    }

    public static Rectangle parse(String in){
        String[] str = in.split(",");
        return new Rectangle(Double.parseDouble(str[1]), Double.parseDouble(str[2]));
    }

    //Perimeter calculator.
    @Override
    public double getPerimeter() {
        return 2 * (this.sideOne + this.sideTwo);
    }

    //Area calculator.
    @Override
    public double getArea() {
        return this.sideOne * this.sideTwo;
    }

    //For getting the name of the object.
    @Override
    public String getName() {
        return super.getName().toUpperCase();
    }
}
