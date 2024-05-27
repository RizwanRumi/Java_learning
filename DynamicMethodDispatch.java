/**
 * Dynamic method dispatch example
 */

 class  A {
    public void show() {
        System.out.println("in A show");    
    }
}

class B extends A {
    public void show() {
        System.out.println("in B show");    
    }
}

class C extends B {
    public void show() {
        System.out.println("in C show");    
    }
}


public class DynamicMethodDispatch {
    public static void main(String[] args) {

        // Runtime polymorphism example
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();


        B obj2 = new B();
        obj2.show(); 

        obj2 = new C();
        obj2.show();
    }
}
