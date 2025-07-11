package Dynamic_method_dispatch;

class A {
    public void show() {
        System.out.println("In A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("In B show");
    }
}
//final- class(stopping inheritance)
//final - method(stopping over riding)


public class ab {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();//In A show

        obj=new B();//We can give type of paren to the child class
        obj.show();//In B show


        final int num=7;
        //num=8; num value is const. so we can't change it
        System.out.println(num);
    }
}
