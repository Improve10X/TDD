package trianglearea;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    private Triangle triangle;

    @BeforeEach
    public void setup() {
        triangle = new Triangle();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenZero_returnZero() {

        int zero = triangle.findEdgeOfATriangle(0, 0);
        assertEquals(0, zero);
    }

    @Test
    public void givenMinusOne_returnMinusOne() {
        Triangle triangle = new Triangle();
        int minusOne = triangle.findEdgeOfATriangle(-1, -1);
        assertEquals(-1, minusOne);
    }

    @Test
    public void givenOne_returnOne() {
        Triangle triangle = new Triangle();
        int value = triangle.findEdgeOfATriangle(1, 1);
        assertEquals(1, value);
    }

    @Test
    public void givenTwo_returnThree() {
        Triangle triangle = new Triangle();
        int value = triangle.findEdgeOfATriangle(2, 2);
        assertEquals(3, value);
    }

    @Test
    public void given5And7_return11() {
        Triangle triangle = new Triangle();
        int value = triangle.findEdgeOfATriangle(5, 7);
        assertEquals(11, value);
    }

    @Test
    public void given8And10_return17() {
        Triangle triangle = new Triangle();
        int value = triangle.findEdgeOfATriangle(8, 10);
        assertEquals(17, value);
    }

    @Test
    public void given9And2_returnOne() {
        Triangle triangle = new Triangle();
        int value = triangle.findEdgeOfATriangle(9, 2);
        assertEquals(10, value);
    }
}
