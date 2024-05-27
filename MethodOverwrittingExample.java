class Calc {

    public int add(int a, int b) {
        return a+b;
    }
} 


class AdvCalc extends Calc {
    public int add(int a, int b) {
        return a+b+1;
    }
}


public class MethodOverwrittingExample {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int result = obj.add(3, 4);
        System.out.println(result);
    }
}
