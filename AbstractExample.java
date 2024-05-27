
abstract class Car 
{
    public abstract void drive();
    public abstract void fly();

    public void playMusic()
    {
        System.out.println("Playing music...");
    }

}

/*  If it needs only one abstract method implementation, then make this class also abstract */

abstract class JameBondCar extends Car 
{   
    public void drive() {
        System.out.println("Can drive too fast...");
    }
}

class ExtendedJameBondCar extends JameBondCar  // Concrete class
{
    public void fly() {
        System.out.println("Can fly...");
    }
    
}

public class AbstractExample {
    public static void main(String[] args) {
        Car obj = new ExtendedJameBondCar();
        obj.drive();
        obj.fly();
        obj.playMusic();
    }
}
