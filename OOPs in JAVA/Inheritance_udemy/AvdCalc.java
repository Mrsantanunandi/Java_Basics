//Calc class is called super class or Parent class
//AvdCalc class is called sub class or child class which inherit it's parent property and as well as having it's own property

public class AvdCalc extends Calc
{
    public int mul(int n1,int n2)
    {
        return n1*n2;
    }
    public int div(int n1,int n2)
    {
        return n1/n2;
    }
}
