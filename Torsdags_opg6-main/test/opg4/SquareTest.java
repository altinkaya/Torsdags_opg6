package opg4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getArea() {
        Square s = new Square(20);
        assertEquals(400,s.getArea());
    }
}