import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N : ");
        int N = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= 5 ; i++) {
            sum = sum + i ;
        }
        System.out.println("Sum : " + sum );
    }
}
