interface  Animals{
    void walk();
}

class Horse implements Animals{
    public void walk()
    {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken implements Animals{
    public void walk()
    {
        System.out.println("Walks on 2 legs");
    }
}
public class inter {
    public static void main(String[] args) {
        Horse h1=new Horse();
        h1.walk();
    }
}
