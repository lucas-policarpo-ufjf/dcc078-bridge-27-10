import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void shouldRenderCorrectlyWithRedColor() {
        Color redColor = new RedColor();
        Triangle triangle = new Triangle(44.0f);
        triangle.setColor(redColor);

        assertEquals("Triangle with area " + 44.0f + " and color hex code " + "#FF0000", triangle.draw());
    }

    @Test
    void shouldRenderCorrectlyWithPurpleColor() {
        Color purpleColor = new PurpleColor();
        Triangle triangle = new Triangle(44.0f);
        triangle.setColor(purpleColor);

        assertEquals("Triangle with area " + 44.0f + " and color hex code " + "#A020F0", triangle.draw());
    }
}