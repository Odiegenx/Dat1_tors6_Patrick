package Task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/// 4.5
class ShapeBuilderTest {
    Circle c;
    Square s;
    ShapeBuilder sb;
    @BeforeEach
    void setUp(){
        c = new Circle(5);
        s = new Square(5);
        sb = new ShapeBuilder();
        sb.addShape(c);
        sb.addShape(s);

    }
    @Test
    void getTotalArena() {
        assertEquals(103.5,sb.getTotalArena());
    }
}