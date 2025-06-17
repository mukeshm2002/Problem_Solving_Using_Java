 // ATM case Withdrawal

import java.util.Scanner;

public class ATMCaseWithdrawal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Bank Balance : ");
        double Balance = scan.nextDouble();
        System.out.print("Enter Your Withdrawal Amount :  ");
        int withdrawal = scan.nextInt();

        if ((withdrawal <= Balance) && (withdrawal >= 200)) {
            System.out.println("Your Successfully Withdraw Your Amount!!! " + " Balance :  " + (Balance-withdrawal));
        }
        else if (withdrawal > Balance) {
            System.out.println("Insufficient Balance Please try low Amount Your Bank  Balance is " + Balance + " only");
        }
        else {
            System.out.println("Only Withdraw above 200  ");
        }

    }
}
