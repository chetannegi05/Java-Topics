package OOPS;

public class AbstractClass {
    public static void main(String[] args)
    {
        Dog obj = new Dog();
        obj.color();
        obj.eat();
        Cat obj2 = new Cat();
        obj2.color();
        obj2.eat();
    }
}
abstract class animal
{
    void eat()
    {
        System.out.println("Grass");
    }
    abstract void color();
}

class Dog extends animal{
    void color()
    {
        System.out.println("Abstract Color is Brown");
    }
}

class Cat extends animal{
    void color()
    {
        System.out.println("Cat color is red");
    }
}