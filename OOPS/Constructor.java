package OOPS;

public class Constructor {
    public static void main(String[] args) {
        int age = 23;
        String name = "Chetan Negi";
        Student s1 = new Student(name , age);
        s1.output();
    }
}

class Student
{
    String name;
    int age;
    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    void output()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
