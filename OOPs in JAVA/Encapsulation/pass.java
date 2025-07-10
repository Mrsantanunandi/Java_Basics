package Encapsulation;

class Password{
    public String username;
    private String password;
    // private String getpassword()
    // {
        // return this.password;
    // }
    public void setpassword(String pass)
    {
        this.password=pass;
    }
    public void printinfo()
    {
        System.out.println(this.username);
    }
}
public class pass {
    public static void main(String[] args) {
        Password p1=new Password();
        p1.username="Santanu%98";
        p1.setpassword("#user87");
        p1.printinfo();
    }
}
