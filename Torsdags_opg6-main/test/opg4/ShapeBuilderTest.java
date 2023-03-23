package opg4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeBuilderTest {

    @Test
    void addShape() {
    }

    @Test
    void getArea() {
        Circle c1 = new Circle(20);
        Square s1 = new Square(10);
        ShapeBuilder shapeBuilder = new ShapeBuilder();
        shapeBuilder.addShape(c1);
        shapeBuilder.addShape(s1);
        assertEquals(20, shapeBuilder.getArea());
    }
}