package Calculator;

import java.text.DecimalFormat;

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
        double result = a*b;
        DecimalFormat df = new DecimalFormat("#.00");
        return Double.parseDouble(df.format(result));
    }

    public double divide(double a, double b) {
        double result = a/b;
        DecimalFormat df = new DecimalFormat("#.00");
        return Double.parseDouble(df.format(result));

    }

    public double exponentiate(double a, double b) {
        double result = Math.pow(a, b);
        DecimalFormat df = new DecimalFormat("#.00");
        return Double.parseDouble(df.format(result));
    }

}
