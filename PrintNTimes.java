import java.util.Scanner;

public class PrintNTimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number to Stop Loop");
        int num = scan.nextInt();

        for (int i = 0; i <= num ; i++) {
            System.out.println(i);
        }
    }
}