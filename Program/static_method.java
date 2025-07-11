class Mobile{
    //This are called instance variable
    String brand;
    int cost;
    static String name;

    public void printinfo()
    {
        System.out.println(brand+" : "+cost+" : "+name);
    }
    //we can't directly use a non-static variable inside a static method

    public static void printinfo1(Mobile obj)
    {
        System.out.println(obj.brand+" : "+obj.cost+" : "+name);
    }

}
public class static_method {
    //in main it's static because if we don't make main static then we have to create Class{static_method} without this we can't run main and if the main is not run the class{static_method } created ...here is a deadlock so we need to made main static
    public static void main(String[] args) {
        Mobile m1=new Mobile();
        m1.brand="Apple";
        m1.cost=1800;

        //When we called static variable then called it via classname.variablename
        Mobile.name="SmartPhone";
        //Static variable is one variable it has one copy..it has same value for all

        Mobile m2=new Mobile();
        m2.brand="Samsung";
        m2.cost=1500;

        m1.printinfo();
        m2.printinfo();

        //WE have to call static fun/method via it's class name
        Mobile.printinfo1(m1);
    }
}
