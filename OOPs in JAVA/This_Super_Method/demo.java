package This_Super_Method;
//Every parent class by default called the object class [class A extends Object] even if i don't mention

class A {
    public A()
    {
        super();
        System.out.println("in A");
    }
    public A(int n)
    {
        super();
        System.out.println("In A int");
    }
}
class B extends A{
    public B()
    {
        super();
        System.out.println("in B");
    }
    public B(int n)
    {
        //super(5);
        this();//this called cons of same class -> B() it calls -> A()
        System.out.println("In B int");
    }
}
public class demo{
    public static void main(String[] args) {
        //super class called it prev constractor
        new B(5);
    }
}