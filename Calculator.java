//Simple Calculator using Switch Case

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your First Number :");
        int num1 = scan.nextInt();
        System.out.println("Enter Your Second Number :");
        int num2 = scan.nextInt();
        System.out.println("Enter Your Operator +,-,*,/");
        char operator = scan.next().charAt(0); //Char Get User Input format

        switch (operator){
            case '+':
                System.out.println(num1 + " + " + num2 + " = " +(num1+num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " +(num1-num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " +(num1*num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " = " +(num1/num2));
                break;
            default:
                System.out.println("Invalid operator please select Operator +,-,*,/ only ");
        }

    }
}
