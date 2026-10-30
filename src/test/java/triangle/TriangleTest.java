package triangle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    @Test
    void devolveOsLadosIndicados() {
        Triangle triangle = new Triangle(3, 4, 5);

        assertEquals("3,4,5", triangle.getSideLengths());
    }
}