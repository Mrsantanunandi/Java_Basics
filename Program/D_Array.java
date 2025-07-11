public class D_Array {
    public static void main(String[] args) {
        int arr[][][] = new int[4][4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    arr[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    System.out.print(arr[i][j][k]+"  ");
                }
                System.out.print("    ");
            }
            System.out.println();
        }
    }
}
