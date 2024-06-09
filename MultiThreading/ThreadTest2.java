package MultiThreading;

// use Runnable interface 


class MyThreadTest implements Runnable
{

    @Override
    public void run() {
        int i=1;
        while (true) {
            System.out.println(i + " Hello");
            i++;
        }
    }
}

public class ThreadTest2
{
    public static void main(String[] args) {

        MyThreadTest m = new MyThreadTest();

        Thread t = new Thread(m);
        t.start();

        int i=1;
        while (true) {
            System.out.println(i + " world");
            i++;
        }
        
    }
}
