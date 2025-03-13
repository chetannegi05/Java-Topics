package OOPS;

public class CopyCons {
    public static void main(String[] args) {
        car obj = new car("GelPen",10);
        car obj2 = new car(obj);
        System.out.println(obj2.name);
        System.out.println(obj2.price);
    }
}
class car
{
    String name;
    int price;
    car(String name, int price)
    {
        this.name = name;
        this.price = price;
    }
    car(car obj)
    {
        name = obj.name;
        price = obj.price;
    }
}
