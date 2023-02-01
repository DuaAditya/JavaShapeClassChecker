/*
A Circle class that extends PrintableObject and also implements Shape.
 */


public class Circle extends PrintableObject implements Shape{


    // Radius of cirlce.
    private double radius;

    //Constructors
    private Circle(){}

    private Circle(double radius){
        this.radius = radius;
    }

    //Getters and setters.
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    //Parse method.
    public static Circle parse(String in){
        String[] str = in.split(",");
        return new Circle(Double.parseDouble(str[1]));
    }

    //toString method
    @Override
    public String toString() {
        return getName() +
                " with radius = " + radius;
    }

    //Perimeter calculator.
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    //Area calculator.
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    //For getting the name of the object.
    @Override
    public String getName() {
        return super.getName().toUpperCase();
    }
}
