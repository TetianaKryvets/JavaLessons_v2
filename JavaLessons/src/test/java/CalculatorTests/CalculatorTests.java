package CalculatorTests;


import Calculator.Calculator;
import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.format;

/**
 * User: tetiana.kryvets
 * Date: 11/26/2017
 */
public class CalculatorTests {
    private  Calculator calc;

    @Before
    public void instantiateCalc() {
        calc = new Calculator();
    }

    //tests for  multiply() method
    @Test
    public void mutliplicationPositiveValueTest() {
        assertEquals("'Multiply' method gives incorrect result: ", 6.0, calc.multiply(3,2));
    }

    @Test
    public void mutliplicationZeroValuesTest() {
        assertEquals("'Multiply' method gives incorrect result: ", 0.0, calc.multiply(3, 0));
    }

    @Test
    public void mutliplicationOneNegativeValueTest() {
        assertEquals("'Multiply' method gives incorrect result: ", -6.0, calc.multiply(3, -2));
    }

    @Test
    public void mutliplicationBothNegativeValuesTest() {
        assertEquals("'Multiply' method gives incorrect result: ", 7.39, calc.multiply(-3.33, -2.22));
    }

    @Test  (expected = NumberFormatException.class)
    public void ShouldMultiplyMethodGiveExceptionIfValueIsInWrongFormatTest() {
        assertEquals("'Multiply' method gives incorrect result: ", -6.0,
                calc.multiply(Integer.parseInt("Hello!"), -2));
    }

    //tests for divide method
    @Test
    public void dividePositiveValueTest() {
        assertEquals("'Divide' method gives incorrect result: ", 6.0, calc.divide(12, 2));
    }

    @Test
    public void divideOfZeroValueTest() {
        assertEquals("'Divide' method gives incorrect result: ", 0.0, calc.divide(0, 6));
    }

    @Test
    public void divideOneNegativeValueTest() {
        assertEquals("'Divide' method gives incorrect result: ", -6.0, calc.divide(-24, 4));
    }

    @Test
    public void divideBothNegativeValuesTest() {
        assertEquals("'Divide' method gives incorrect result: ", 7.92, calc.divide(-29, -3.66));
    }

    @Test
    public void divideByZeroTest() {
        try {
            assertEquals("'Divide' method gives incorrect result: ", -23.0, calc.divide(31, 0));
        } catch (NumberFormatException ae) {
            System.out.println("NumberFormatException occured!");
        }
    }

    @Test  (expected = NumberFormatException.class)
    public void divideValueIsInWrongFormatTest() {
        assertEquals("'Divide' method gives incorrect result: ", -23.0,
                calc.divide(Integer.parseInt("La-la-la"), 8));
    }

    //tests for exponentiate method
    @Test
    public void exponentiatePositiveValueTest() {
        assertEquals("'Exponentiate' method gives incorrect result: ", 41.73,
                calc.exponentiate(6.46, 2));
    }

    @Test
    public void exponentiateZeroValuesTest() {
        assertEquals("'Exponentiate' method gives incorrect result: ", 0.0,
                calc.exponentiate(0, 2.35));
    }

    @Test
    public void exponentiateNegativeValuesTest() {
        assertEquals("'Exponentiate' method gives incorrect result: ", 38.44, calc.exponentiate(-6.2, 2));
    }

    @Test
    public void exponentiateWithNegativeExponentiateValueTest() {
        assertEquals("'Exponentiate' method gives incorrect result: ", 0.0,
                calc.exponentiate(31, -2));
    }

    @Test (expected = NumberFormatException.class)
    public void exponentiateValueIsInWrongFormatTest() {
        assertEquals("'Exponentiate' method gives incorrect result: ", 15,
                calc.exponentiate(Integer.parseInt("Hello!"), -2));
    }

}
