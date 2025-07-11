package Inheritance;

class Shapex{
    public void area()
    {
        System.out.println("Print area");
    }    
}
// by using extends keyword we inherite another class

class Triangle extends Shapex{
    public void area(int b,int h)
    {
        System.out.println("Area is : " + ((0.5)*b*h));
    }
}

class Circle extends Shapex{
    public void area(int r)
    {
        System.out.println("Area is : " + ((3.14)*r*r));
    }
}

public class hierarchical {
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.area(6);
    }
}
