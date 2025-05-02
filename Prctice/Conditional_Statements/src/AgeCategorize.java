//Identify the Age Categorize Child, Teen, Adult, Senior

import java.util.Scanner;

public class AgeCategorize {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Age Please : ");
        int age = scan.nextInt();

        if (age <= 12) {
            System.out.println("You are Children !!!");
        }
        else if (age <= 20) {
            System.out.println("You are Teenager !!!");
        }
        else if (age <= 50) {
            System.out.println("You Are Adult !!!");
        }
        else {
            System.out.println("You Are Senior !!!");
        }
    }
}
