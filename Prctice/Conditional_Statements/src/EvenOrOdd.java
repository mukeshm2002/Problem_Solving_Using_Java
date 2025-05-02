//Identify the Number Add Or Even Without % operator

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = scan.nextInt();

        //Using & Operator Bitwise Method like 0101(5) & 0001(1) == 0001(1)
        if ((num & 1) == 0) {
            System.out.println(num +" is Even Number");
        }
        else {
            System.out.println(num + " is Odd Number ");
        }
    }
}


