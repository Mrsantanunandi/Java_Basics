package Inheritance;

class Shape{
    public void area()
    {
        System.out.println("Print area");
    }    
}
// by using extends keyword we inherite another class

class Triangles extends Shape{
    public void area(int b,int h)
    {
        System.out.println("Area is : " + ((0.5)*b*h));
    }
}

class Equilateral_triangle extends Triangles{
    public void area(int b,int h)
    {
        System.out.println("Lenght of each side: "+ b);
        System.out.println("Area is : " + ((0.5)*b*h));
    }
}

public class multi {
    public static void main(String[] args) {
        Equilateral_triangle e1=new Equilateral_triangle();
        e1.area(8,8);
    }
}
