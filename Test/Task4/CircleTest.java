package Task4;
//// 4.2
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c;
    @BeforeEach
    void setUp(){
        c = new Circle(5);
    }


    @Test
    void getArea() {
        assertEquals(78.5,c.getArea());
    }
}
class SquareTest {
    Square s;
    @BeforeEach
    void setUp(){
        s = new Square(5);
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        assertEquals(25,s.getArea());
    }
}