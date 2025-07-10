package Inheritance;

class Shape{
    public void area()
    {
        System.out.println("Print area");
    }    
}
// by using extends keyword we inherite another class

class Triangle extends Shape{
    public void area(int b,int h)
    {
        System.out.println("Area is : " + ((0.5)*b*h));
    }
}

public class single {
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        t1.area(5,8);
    }
}
