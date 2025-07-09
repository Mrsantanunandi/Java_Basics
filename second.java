import java.util.Scanner;

public class second{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        int[] array;
        int n;
        System.out.print("Enter the size of the array: ");
        n=scanner.nextInt();
        array=new int[n];//creating an array of size n
        System.out.println("Enter  "+ n + " element in the array:");
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        System.out.println("Arry length is : " + array.length);
        System.out.println("Array is: ");
        // for(int i=0;i<n;i++)
        // {
            // System.out.print(array[i] + " ");
        // }
        for(int element:array)
        {
            System.out.print(element+"  ");
        }
        //System.out.println("Sorted array is: ");
        //System.out.println(Arrays.toString(array));
        //int index=Arrays.binarySearch(array,3);//3 is the elm i am searching for
        //System.out.println(index);
        scanner.close();
    }
}
 