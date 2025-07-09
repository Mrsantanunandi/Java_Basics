public class Try_except{
    public static void main(String[] args)
    {
        int[] array={23,24,56};
        try {
            System.out.println(array[4]);
        } catch (Exception e) {
            System.out.println("length is less than 4");
            System.out.println("Please enter correct index");
        }
        System.out.println("hello");
    }
}