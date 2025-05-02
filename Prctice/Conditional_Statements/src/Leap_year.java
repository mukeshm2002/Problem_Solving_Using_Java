//Write a program to determine if a Year is a leap year without using library Functions.

import java.util.Scanner;

public class Leap_year{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Year : ");
        int year = scan.nextInt();


        //Leap Year Rules its Divisible 4 and Not divisible 100 or its also divisible 400 !!!

        if((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0)){
            System.out.println(year + " is a Leap Year");
        }
        else {
            System.out.println(year + " is a Not Leap Year");
        }
    }
}