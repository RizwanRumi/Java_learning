class Mobile
{
    String brand;
    int price;
    static String name;


    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj)
    {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}


public class StaticDemo {
    public static void main(String []a) {

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 2000;

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1000;

        Mobile.name = "Smartphone";

        obj1.show();
        Mobile.show1(obj2);
        
    }
}
