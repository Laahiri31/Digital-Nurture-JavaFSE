package com.example.test;

import static org.junit.Assert.*;
import org.junit.Test;

import com.example.Calculator;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(10, calc.add(5, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(3, calc.subtract(5, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(20, calc.multiply(4, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calc.divide(10, 5));
    }
}