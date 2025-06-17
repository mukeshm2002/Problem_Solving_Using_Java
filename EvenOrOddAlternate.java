//With % operator


import java.util.Scanner;

public class EvenOrOddAlternate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int num = scan.nextInt();

        // Using % Operator like 2 % 2 == 0 even Number
        if (num % 2 == 0 ) {
            System.out.println(num + " Is Even Number");
        }
        else {
            System.out.println(num+ " Is Odd Number");
        }
    }
}
