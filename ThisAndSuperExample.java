
class A {
    public A()
    {
        System.out.println("in A");
    } 

    public A(int n)
    {
        System.out.println("in A int");
    }
}

class B extends A {
    public B()
    {
        super();
        System.out.println("in B");
    } 

    public B(int n)
    {
        this();
        //super(5);
        System.out.println("in B int");
    }
}

/*
 * this() -> executes the constructor of same class
 * super() -> executes the constructor of super class
 * Class A extends Object class
 */

public class ThisAndSuperExample {
    public static void main(String a[])
    {
        B obj = new B(5);
    }
}
