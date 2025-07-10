class Pen {
    String color;
    String type;

    public void write() {
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

class Student {
    String name;
    String age;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Student(String name,String age) {
        // this.name = "ajay";
        // this.age = "24";
    // }
    Student(Student s2)
    {
        this.name=s2.name;
        this.age=s2.age;
    }
    Student()
    {

    }
}

public class OOP {
    public static void main(String[] args) {

        // Pen pen1=new Pen();
        // pen1.color="blue";
        // pen1.type="gel";

        // Pen pen2=new Pen();
        // pen2.color="black";
        // pen2.type="ballpen";

        // pen1.write();
        // pen2.write();

        //Student s1 = new Student("ajay","24");
        //s1.printinfo();
        Student s1=new Student();
        s1.name="Santanu";
        s1.age="20";

        Student s2=new Student(s1);
        s2.printinfo();
    }
}