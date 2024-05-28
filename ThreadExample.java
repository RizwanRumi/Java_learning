class A extends Thread {
    public void run()
    {
        for(int i = 0; i < 20; i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run()
    {
        for(int i = 0; i < 20; i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        System.out.println(obj1.getPriority());

        /*
         * SetPriority(): basically you are suggested the schedular the priority, 
         * then schedular will check who will take the less time, that might be goes first
         * to execute, SetPriority() does not mean that it will execute always first.  
         */
        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();
    }
}
