//Determine the largest off three Numbers Using If statement Only

import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number 1 : ");
        int num1 = scan.nextInt();

        System.out.println("Enter Number 2 : ");
        int num2 = scan.nextInt();

        System.out.println("Enter Number 3 : ");
        int num3 = scan.nextInt();


        if (num1 > num2 && num1 > num3) {
            System.out.println("Number 1 is Greater !");
        } else if (num2 > num3 && num1 < num2) {
            System.out.println("Number 2 is Greater !");
        }
        else {
            System.out.println("Number 3 is Greater !");
        }
    }
}
