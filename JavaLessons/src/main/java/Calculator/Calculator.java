package Calculator;

/**
 * User: tetiana.kryvets
 * Date: 11/26/2017
 */
public class Calculator {
    private double a, b;

    public double getA() {
       return a;
    }

    public double getB() {
        return b;
    }

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double multiply() {
        return a*b;
    }

    public double divide() {
        return a/b;
    }

    public double exponentiate() {
        return  Math.pow(a, b);
    }

}
