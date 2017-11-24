package Loops;

/**
 * User: tetiana.kryvets
 * Date: 11/24/2017
 */
public class ExamplesWithWhile {
    public static void main (String[] arg) {
        int startValue = 5;
        int endValue = 10;
        int sum = 0, sum1 = 0;
        double average = 0;
        int i = startValue;

        while(i <= endValue) {
            sum = sum + i;
            i++;
        }
        average = sum / (endValue - startValue);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("===========");

        do {
            sum1 = sum1 + i;
            i++;
        } while (i <= endValue);

        average = sum / (endValue - startValue);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
