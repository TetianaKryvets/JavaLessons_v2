package Calculator;

/**
 * User: tetiana.kryvets
 * Date: 11/26/2017
 */

//TASK:
/*    Create a Calculator that will have the following behaviour:

             - multiply that will multiply two numbers
             - divide that will divide two numbers
             - exponentiate that will take a number a and exponentiate it by a number b

            The requirement here is to complete growing out this Calculator class using TDD
*/
public class Main  {

    public static void main (String[] args) {
        Calculator calc = new Calculator();
        double resultOfMultiply = 0;
        double resultOfDivide = 0;
        double resultOfXxponentiate = 0;

        resultOfMultiply = calc.multiply(2.0,3.0);
        System.out.println("resultOfMultiply = " + resultOfMultiply);

        resultOfDivide = calc.divide(6.0, 2.0);
        System.out.println("resultOfMultiply = " + resultOfDivide);

        resultOfXxponentiate = calc.exponentiate(6.0, 2.0);
        System.out.println("resultOfXxponentiate = " + resultOfXxponentiate);






    }


}
