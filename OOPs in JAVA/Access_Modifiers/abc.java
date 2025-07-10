package Access_Modifiers;

class Account{
   public String name;
   protected String email;
   private String password;

   public void printinfo()
   {
        System.out.println(this.name);
        System.out.println(this.email);
   }
   public void setpassword(String pass)
   {
        this.password=pass;
   }
}
public class abc {
    public static void main(String[] args) {
        Account a1=new Account();
        a1.name="Santanu";
        a1.email="santanu2005nandis@gmail.com";
        a1.setpassword("San&45$90");
        a1.printinfo();
    }
}
