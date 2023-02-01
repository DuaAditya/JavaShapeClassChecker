/*
The Driver class reading and then printing all the shapes with their respective radius or sides.
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class Driver {
    public static void main(String[] args) throws IOException {

        // Reading the.txt file over here.
        try (BufferedReader in = new BufferedReader(new FileReader("shape.txt"))) {
            String blanky = "";
            ArrayList<Shape> shapeDriv = new ArrayList<>();

            while ((blanky = in.readLine()) != null) {
                String[] line = blanky.split(",");
                if (line.length == 3) {
                    shapeDriv.add(Rectangle.parse(blanky));
                } else {
                    shapeDriv.add(Circle.parse(blanky));
                }
            }

            //Using collections.sort() over here ==>
            Collections.sort(shapeDriv, (shapeOne, shapeTwo) -> {
                // Using if and else.
                if (shapeOne.getName().compareTo(shapeTwo.getName()) > 0) {
                    return 1;
                } else if (shapeOne.getName().compareTo(shapeTwo.getName()) < 0) {
                    return -1;
                } else {
                    if (shapeOne.getArea() > shapeTwo.getArea()) {
                        return 1;
                    } else if (shapeOne.getArea() < shapeTwo.getArea()) {
                        return -1;
                    }
                    return 0;

                }
            });
            // Using the loop to print out the shape with their respective radius or sides.
            for (Shape shape : shapeDriv) {
                Printable printable = (Printable) shape;

                printable.print();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
// The END