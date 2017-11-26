package CalculatorTests;


import Calculator.Calculator;
import com.sun.javaws.exceptions.InvalidArgumentException;
import junit.framework.AssertionFailedError;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * User: tetiana.kryvets
 * Date: 11/26/2017
 */
public class CalculatorTests {
    //tests for  multiply() method
    @Test
    public void ShouldMutliplicationOfTwoPositiveValueGiveCorrectResultTest() {
        assertEquals("'Multiply' method gives incorrect result: ", 6.0, (new Calculator(3, 2).multiply()));
    }

    @Test
    public void ShouldMutliplicationWorksCorrectWithZeroValuesTest() {
        assertEquals("'Multiply' method gives incorrect result: ", 0.0, (new Calculator(3, 0).multiply()));
    }

    @Test
    public void ShouldMutliplicationWorksCorrectWithNegativeValuesTest() {
        assertEquals("'Multiply' method gives incorrect result: ", -6.0, (new Calculator(3, -2).multiply()));
    }

    //tests for divide method
    @Test
    public void ShouldDivideMethidOfTwoPositiveValueGiveCorrectResultTest() {
        assertEquals("'Divide' method gives incorrect result: ", 6.0, (new Calculator(12, 2).divide()));
    }

    @Test
    public void ShouldDivideMethodWorksCorrectWithZeroValuesTest() {
        assertEquals("'Divide' method gives incorrect result: ", 0.0, (new Calculator(0, 6).divide()));
    }

    @Test
    public void ShouldDivideMethodWorksCorrectWithNegativeValuesTest() {
        assertEquals("'Divide' method gives incorrect result: ", -6.0, (new Calculator(-24, 4).divide()));
    }

    @Test  (expected = AssertionFailedError.class)
    public void ShouldDivideMethodReturnExceptionInCaseOfDivisionByZeroTest() {
        assertEquals("'Divide' method gives incorrect result: ", -23.0, (new Calculator(31, 0).divide()));
    }

    //tests for exponentiate method
    @Test
    public void ShouldExponentiateMethidOfTwoPositiveValueGiveCorrectResultTest() {
        assertEquals("'Exponentiate' method gives incorrect result: ", 36.0, (new Calculator(6, 2).exponentiate()));
    }

    @Test
    public void ShouldExponentiateMethodWorksCorrectWithZeroValuesTest() {
        assertEquals("'Exponentiate' method gives incorrect result: ", 0.0, (new Calculator(0, 2).exponentiate()));
    }

    @Test
    public void ShouldExponentiateMethodWorksCorrectWithNegativeValuesTest() {
        assertEquals("'Exponentiate' method gives incorrect result: ", 36.0, (new Calculator(-6, 2).exponentiate()));
    }

    @Test (expected = AssertionFailedError.class)
    public void ShouldExponentiateMethodWorksCorrectlyWithNegativeExponentiateVelueTest() {
        assertEquals("'Exponentiate' method gives incorrect result: ", 15, (new Calculator(31, -2).exponentiate()));
    }

}
