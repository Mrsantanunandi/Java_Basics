class Human{
    private int age;
    private String name;
    public int getage(){
        return age;
    }
    public String getname(){
        return name;
    }
    public void setage(int age){
        this.age=age;
    }
    public void setname(String name){
        this.name=name;
    }
}

public class getter_setter {
    public static void main(String[] args) {
        Human h1=new Human();
        h1.setage(30);
        h1.setname("Sanu");

        System.out.println(h1.getname()+" : "+h1.getage());
    }
}