package com.example.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.example.Calculator;

public class CalculatorAAATest {

    Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
        System.out.println("Setup Executed");
    }

    @After
    public void tearDown() {
        System.out.println("Teardown Executed");
    }

    @Test
    public void testAddition() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calc.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    @Test
    public void testMultiplication() {

        // Arrange
        int a = 5;
        int b = 6;

        // Act
        int result = calc.multiply(a, b);

        // Assert
        assertEquals(30, result);
    }
}