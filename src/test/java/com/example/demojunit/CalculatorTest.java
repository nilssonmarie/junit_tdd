package com.example.demojunit;

import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void addShouldAddValues() {
        assertEquals(7, calculator.add(5, 2));
    }

    @Test
    void subtractShouldSubtractValues() {
        assertEquals(-4, calculator.subtract(3, 7));
    }

    @Test
    void multiplyShouldMultiplyValues( ) {
        assertEquals(100, calculator.multiply(25, 4));
    }

    @Test
    void divideShouldDivideValues( ) {
        assertEquals(25, calculator.divide(100, 4));
    }

    @Test
    void squareRootShouldFindSquare() {
        assertEquals(95, calculator.squareRootOf(9025));
    }

    @Test
    void getAreaShouldReturnAreaRoundedToTwoDecimalsIfRadiusIsPositive() {
        assertEquals(12.57, calculator.getArea(2));
    }

    @Test
    void getAreaShouldFailIfRadiusIsNegative() {
        assertEquals(Double.NaN, calculator.getArea(-2));
    }

    @Test
    void getCircumferanceShouldReturnCircumferanceRoundedToTwoDecimalsIfRadiusIsPositive() {
        assertEquals(18.85, calculator.getCircumference(3));
    }

    @Test
    void getCircumferanceShouldFailIfRadiusIsNegative() {
        assertEquals(Double.NaN, calculator.getCircumference(-3));
    }

    // getCircumferanceShouldFailIfRadiusIsLessThanZero
    // getCircumferanceShouldReturnRadiusOnValidInput

}
