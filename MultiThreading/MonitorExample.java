package MultiThreading;


// Example of Monitor: use synchronized block or synchronized method

class MyData 
{
    /* 
    synchronized void Display(String str)
    {
        for(int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
            System.out.println();
    }
    */
    
    void Display(String str)
    {
        synchronized(this)
        {
            for(int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
                
                // just to check synchronization is working
                try
                {
                    Thread.sleep(100);

                }
                catch(Exception e) {
                    System.out.println(e);
                }
            }
            System.out.println();
        }  
    }
}


class MyThread1 extends Thread
{
    MyData data1;

    MyThread1(MyData data) {
        this.data1 = data;
    }

    public void run()
    {
        data1.Display("Hello World");
    } 
} 


class MyThread2 extends Thread
{
    MyData data2;

    MyThread2(MyData data) {
        this.data2 = data;
    }

    public void run()
    {
        data2.Display("Welcome All");
    } 
}

public class MonitorExample {
    public static void main(String[] args)  throws Exception{
        MyData d = new MyData();

        MyThread1 t1 = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);

        t1.start();
        t2.start();
    }
}
