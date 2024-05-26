class Mobile
{
    String brand;
    int price;
    static String name;

    // in java, static variable are assigned in below  
    static 
    {
        name = "Phone";
        System.out.println("call static block");
    }   

    public Mobile()
    {
        brand = "Apple";
        price = 2000;

        System.out.println("call constructor block");
    }

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

    
}


public class StaticDemo {
    public static void main(String []a) {

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 2000;
        Mobile.name = "Smartphone";

        Mobile obj2 = new Mobile();

        /*
         * In this example class will load once but objects are instantiated twice.
         * Static belongs to class member, not object
         */
        
        // if we just want to load class
        //Class.forName("Mobile");
    }
}
