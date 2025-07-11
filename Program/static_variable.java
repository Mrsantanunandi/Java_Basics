class Mobile{
    //This are called instance variable
    String brand;
    int cost;
    static String name;

    public void printinfo()
    {
        System.out.println(brand+" : "+cost+" : "+name);
    }
}
public class static_variable {
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
    }
}
