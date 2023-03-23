package opg4;

import java.util.ArrayList;

public class ShapeBuilder implements Shape {


    ArrayList<Shape> shapes;

    public ShapeBuilder() {

        shapes = new ArrayList<>();
    }

    public void addShape(Shape s) {
        shapes.add(s);

    }

    @Override
    public double getArea() {
        double count = 0;
        for (Shape s:shapes){
            count = s.getArea()+count;


        }

        return count;
    }
}
