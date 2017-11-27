package CalculatorTests;


import Calculator.Calculator;
import com.sun.javaws.exceptions.InvalidArgumentException;
import junit.framework.AssertionFailedError;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

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
    public void ShouldMutliplicationOfTwoPositiveValueGiveCorrectResultTest() {
        assertEquals("'Multiply' method gives incorrect result: ", 6.0, calc.multiply(3,2));
    }

    @Test
    public void ShouldMutliplicationWorksCorrectWithZeroValuesTest() {
        assertEquals("'Multiply' method gives incorrect result: ", 0.0, calc.multiply(3, 0));
    }

    @Test
    public void ShouldMutliplicationWorksCorrectWithNegativeValuesTest() {
        assertEquals("'Multiply' method gives incorrect result: ", -6.0, calc.multiply(3, -2));
    }

    @Test  (expected = NumberFormatException.class)
    public void ShouldMultiplyMethodGiveExceptionIfValueIsInWrongFormatTest() {
        assertEquals("'Multiply' method gives incorrect result: ", -6.0,
                calc.multiply(Integer.parseInt("Hello!"), -2));
    }

    //tests for divide method
    @Test
    public void ShouldDivideMethidOfTwoPositiveValueGiveCorrectResultTest() {
        assertEquals("'Divide' method gives incorrect result: ", 6.0, calc.divide(12, 2));
    }

    @Test
    public void ShouldDivideMethodWorksCorrectWithZeroValuesTest() {
        assertEquals("'Divide' method gives incorrect result: ", 0.0, calc.divide(0, 6));
    }

    @Test
    public void ShouldDivideMethodWorksCorrectWithNegativeValuesTest() {
        assertEquals("'Divide' method gives incorrect result: ", -6.0, calc.divide(-24, 4));
    }

    @Test  (expected = AssertionFailedError.class)
    public void ShouldDivideMethodReturnExceptionInCaseOfDivisionByZeroTest() {
        assertEquals("'Divide' method gives incorrect result: ", -23.0, calc.divide(31, 0));
    }

    @Test  (expected = NumberFormatException.class)
    public void ShouldDivideMethodGiveExceptionIfValueIsInWrongFormatTest() {
        assertEquals("'Divide' method gives incorrect result: ", -23.0,
                calc.divide(Integer.parseInt("La-la-la"), 8));
    }

    //tests for exponentiate method
    @Test
    public void ShouldExponentiateMethidOfTwoPositiveValueGiveCorrectResultTest() {
        assertEquals("'Exponentiate' method gives incorrect result: ", 36.0,
                calc.exponentiate(6, 2));
    }

    @Test
    public void ShouldExponentiateMethodWorksCorrectWithZeroValuesTest() {
        assertEquals("'Exponentiate' method gives incorrect result: ", 0.0,
                calc.exponentiate(0, 2));
    }

    @Test
    public void ShouldExponentiateMethodWorksCorrectWithNegativeValuesTest() {
        assertEquals("'Exponentiate' method gives incorrect result: ", 36.0, calc.exponentiate(-6, 2));
    }

    @Test (expected = AssertionFailedError.class)
    public void ShouldExponentiateMethodWorksCorrectlyWithNegativeExponentiateVelueTest() {
        assertEquals("'Exponentiate' method gives incorrect result: ", 15,
                calc.exponentiate(31, -2));
    }

    @Test (expected = NumberFormatException.class)
    public void ShouldExponentiateMethoGiveExceptionIfVelueIsInWrongFormatTest() {
        assertEquals("'Exponentiate' method gives incorrect result: ", 15,
                calc.exponentiate(Integer.parseInt("Hello!"), -2));
    }

}
