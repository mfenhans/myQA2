package lv.testname.tutorial;

public class Calculator {
    public void addition(double a, double b) {
        double sum = a + b;
        System.out.println("The sum of two numbers are" + sum);
    }

    public void substraction(double a, double b) {
        double sum = a - b;
        System.out.println("The Substraction sum of two numbers are" + sum);
    }

    public void multiplication(double a, double b) {
        double sum = a * b;
        System.out.println("The multiplication sum of two numbers are" + sum);
    }

    public void division(double a, double b) {
        double sum = a / b;
        System.out.println("The division sum of two numbers are" + sum);
    }

    public void reminder(double a, double b) {
        double sum = a % b;
        System.out.println("The reminder sum of two numbers are" + sum);
    }
}
