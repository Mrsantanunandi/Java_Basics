public class Jugged_array {
    public static void main(String[] args) {
        int arr[][]=new int[3][];
        arr[0]=new int[3];
        arr[1]=new int[4];
        arr[2]=new int[2];

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=(int)(Math.random()*10);
            }
        }

        System.out.println("Array is: ");

        for(int n[]:arr)
        {
            for(int m: n)
            {
                System.out.print(m+" ");
            }
            System.out.println();
        }

    }
}
