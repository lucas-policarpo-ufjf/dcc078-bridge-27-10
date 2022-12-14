import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void shouldRenderCorrectlyWithRedColor() {
        Color redColor = new RedColor();
        Circle triangle = new Circle(44.0f);
        triangle.setColor(redColor);

        assertEquals("Circle with area " + 44.0f + " and color hex code " + "#FF0000", triangle.draw());
    }

    @Test
    void shouldRenderCorrectlyWithPurpleColor() {
        Color purpleColor = new PurpleColor();
        Circle triangle = new Circle(44.0f);
        triangle.setColor(purpleColor);

        assertEquals("Circle with area " + 44.0f + " and color hex code " + "#A020F0", triangle.draw());
    }
}