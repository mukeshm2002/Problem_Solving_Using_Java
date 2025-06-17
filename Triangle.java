//write a program to check whether a triangle is scalene, isosceles, equilateral.

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Side A : ");
        int a = scan.nextInt();

        System.out.println("Enter Side B : ");
        int b= scan.nextInt();

        System.out.println("Enter side C : ");
        int c = scan.nextInt();

        //To form a valid triangle ,the sum of any two sides must be greater than the third side.
        // Formulas (a + b > c)(a + c > b)(b + c > a)
        //Equilateral Triangle ---> a == b == c (All Sides Are Equal)
        //Isosceles Triangle ---> a == b || b == c || a == c (Any Two Sides Are Equal)
        //Scalene Triangle ----> a != b && b != c && a != c (All side are different)

        if (a == b && b == c && c == a) {
            System.out.println("This is Equilateral Triangle ! ");
        } else if (a == b || b == c || c == a) {
            System.out.println("This is Isosceles Triangle ! ");
        }
        else {
            System.out.println("This is Scalene Triangle ! ");
        }
    }
}
