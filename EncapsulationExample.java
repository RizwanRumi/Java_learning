/**
 *  Encapsulation: protect data and methods from outside
 */

class  Human {
    private int age;
    private String name;
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}


public class EncapsulationExample {
    public static void main(String a[]) {
        Human obj = new Human();
        obj.setAge(30);
        obj.setName("Rizwan");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
