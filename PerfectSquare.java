import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int number = scan.nextInt();

        boolean isPerfectSquare = false ;
        for (int i=1 ; i * i <= number; i++){
            if (i * i == number ) {
                isPerfectSquare = true ;
                break;
            }
        }
        if (isPerfectSquare) {
            System.out.println(number + " is a perfect square");
        }
        else {
            System.out.println(number+" is not a perfect square ");
        }
    }
}
