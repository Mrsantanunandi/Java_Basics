import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number b/w(1-100): ");
        int num;
        int ran = ((int)(Math.random() * 100));
        do {
            num = scanner.nextInt();
            if (ran == num) {
                System.out.println("Yeahh!! You Win");
                break;
            } else if (num > ran) {
                System.out.println("Enter number is very large");
            } else {
                System.out.println("Enter number is very small");
            }
        } while (num >= 0);
        System.out.println("Computer num is "+ ran);

        scanner.close();
    }
}
