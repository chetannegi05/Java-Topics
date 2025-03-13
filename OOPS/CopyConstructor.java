package OOPS;

public class CopyConstructor {
    public static void main(String[] args) {
        StudentData s1 = new StudentData();
        s1.name = "Chetan Negi";
        s1.age = 18;
        StudentData s2 = new StudentData(s1);
        s2.display();
    }
}

class StudentData {
    String name;
    int age;

    StudentData() {
        return;
    }

    StudentData(StudentData s1)
    {
        this.name = s1.name;
        this.age = s1.age;
    }
    void display()
    {
        System.out.println("Name: "+name + "Age: " + age );
    }
}
