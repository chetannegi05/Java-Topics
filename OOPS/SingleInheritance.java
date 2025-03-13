package OOPS;

public class SingleInheritance {
    public static void main(String[] args)
    {
        Fish obj = new Fish();
        obj.breadth();
        obj.swim();
        obj.eat();
    }
}
class Animal
{
    String color;
    void eat()
    {
        System.out.println("Eating");
    }
    void breadth()
    {
        System.out.println("Breadth");
    }
}
class Fish extends Animal
{
    void swim()
    {
        System.out.println("Swim");
    }
}