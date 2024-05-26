class Calculator
{
    // Method overloading
    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    }
    public int add(int n1, int n2, int n3)
    {
        int r = n1 + n2 + n3;
        return r;
    }

    public double add(double n1, double n2)
    {
        double r = n1 + n2;
        return r;
    }
}


public class MethodOverloadingExample {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        int num3 = 6;

        Calculator calc = new Calculator();

        int result = calc.add(num1, num2);
        System.out.println(result);

        int result1 = calc.add(num1, num2, num3);
        System.out.println(result1);

        double num4 = 4.4;
        double num5 = 5.5;

        double result2 = calc.add(num4, num5);
        System.out.println(result2);

    }
}
