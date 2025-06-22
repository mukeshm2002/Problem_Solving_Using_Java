import java.util.Scanner;

public class NTimesPrintEvenNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Last Even Number");
        int num = scan.nextInt();

        for (int i = 0; i <= num ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
