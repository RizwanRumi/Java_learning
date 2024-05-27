
interface Computer {
    void Code();
}

class Laptop implements Computer 
{
    public void Code() {
       System.out.println("Code using laptop");
    }
    
}

class Desktop implements Computer 
{
    public void Code() {
       System.out.println("Code using Desktop");
    }
    
}

class Developer 
{
    public Developer(Computer cmp)
    {
        cmp.Code();
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer Rizwan = new Developer(desk);
        Developer Rumi = new Developer(lap);

    }
}
