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

public class ThreadMethods2Example
{
    public static void main(String[] args) throws Exception {
                
        /*
        MyThreadTest t = new MyThreadTest();         
        // Daemon thread is dependent on main thread, if main thread terminated, Deamon will be terminated
        t.setDaemon(true);
        t.start();

        // try {
        //     Thread.sleep(100);
        // }
        // catch(Exception e) {}

        
        Thread mainThread = Thread.currentThread();
        // will wait for finishing current thread
        mainThread.join();
        */

        MyThreadTest t = new MyThreadTest();
        t.start();

        int count = 1;

        while(true)
        {
            System.out.println(count++ + " Main");
            // basically use to solve the starvation of thread, and give access to run other threads
            Thread.yield();
        }


    }
}

