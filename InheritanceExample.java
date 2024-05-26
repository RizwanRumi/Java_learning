
class Calc {

    public int add(int a, int b) {
        return a+b;
    }

    public int sub(int a, int b) {
        return a-b;
    }
} 


class AdvCalc extends Calc {
    public int mul(int a, int b) {
        return a*b;
    }

    public int div(int a, int b) {
        return a/b;
    }
}


public class InheritanceExample {
    public static void main(String a[]) {
        AdvCalc advCalc = new AdvCalc();
        int r1 = advCalc.add(5, 6);
        int r2 = advCalc.sub(25, 5);
        int r3 = advCalc.mul(4, 4);
        int r4= advCalc.div(10, 2);

        System.out.println(r1 + " " + r2 + " " + " " + r3 + " " + r4);
    }
}
