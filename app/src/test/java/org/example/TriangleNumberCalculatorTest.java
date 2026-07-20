package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleNumberCalculatorTest {

    @Test
    public void testValueOfOne() {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();

        assertEquals(1, calculator.value(1));
    }

    @Test
    public void testValueOfTwo() {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();

        assertEquals(3, calculator.value(2));
    }

    @Test
    public void testValueOfFour() {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();

        assertEquals(10, calculator.value(4));
    }

    @Test
    public void testAdd() {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();

        assertEquals(9, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();

        assertEquals(7, calculator.subtract(4, 2));
    }
}