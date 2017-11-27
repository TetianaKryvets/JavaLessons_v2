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

    public void setA(double a) {
        this.a = a;
    }

    public void setB (double b) {
        this.b = b;
    }

    public double multiply(double a, double b) {
        return a*b;
    }

    public double divide(double a, double b) {
        return a/b;
    }

    public double exponentiate(double a, double b) {
        return  Math.pow(a, b);
    }

}
