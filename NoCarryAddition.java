import java.util.Scanner;

public class NoCarryAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two integers
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = 0;
        int place = 1;

        while (a > 0 || b > 0) {
            int digitA = a % 10;
            int digitB = b % 10;

            int sumWithoutCarry = (digitA + digitB) % 10;

            result += sumWithoutCarry * place;

            place *= 10;
            a /= 10;
            b /= 10;
        }

        System.out.println(result);
    }
}
