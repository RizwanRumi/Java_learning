package MultiThreading;


// use Thread class 


class MyThreadTest extends Thread
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

public class ThreadTest
{
    public static void main(String[] args) {

        MyThreadTest t = new MyThreadTest();
        t.start();

        int i=1;
        while (true) {
            System.out.println(i + " world");
            i++;
        }
        
    }
}