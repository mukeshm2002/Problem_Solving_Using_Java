import java.util.Scanner;

public class NTimesPrintOddNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the last Odd Num");
        int num = scan.nextInt();

        for (int i = 0; i <= num ; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
