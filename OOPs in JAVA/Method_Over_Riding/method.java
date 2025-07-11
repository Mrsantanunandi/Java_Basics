package Method_Over_Riding;

class Cal{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
}
class Avdcal{
    public int add(int n1,int n2)
    {
        return n1+n2+1;
    }
}
public class method {
    public static void main(String[] args) {
        Avdcal a=new Avdcal();
        int r=a.add(7, 7);
        //if i call add then add method over ride over class A add method
        System.out.println(r);
    }
}
