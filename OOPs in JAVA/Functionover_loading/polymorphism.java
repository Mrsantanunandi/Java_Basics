package Functionover_loading;

class Student
{
    String name;
    int age;

    public void printinfo(String name)
    {
        System.out.println(name);
    }
    public void printinfo(int age)
    {
        System.out.println(age);
    }
    public void printinfo(String name,int age)
    {
        System.out.println(name+ "  " + age);
    }
}

//This is also known as compile time polymorphism

public class polymorphism {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Santanu";
        s1.age=25;

        //s1.printinfo(s1.age);
        s1.printinfo("Santanu", 55);
    }
}
