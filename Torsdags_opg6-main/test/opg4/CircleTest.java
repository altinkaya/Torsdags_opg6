package opg4;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @org.junit.jupiter.api.Test
    void getArea() {
        Circle c = new Circle(20);
        assertEquals(125,c.getArea());
    }
}