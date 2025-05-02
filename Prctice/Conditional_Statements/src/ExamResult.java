//Exam Result

import java.util.Scanner;

public class ExamResult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Mark Subject 01 : ");
        int subject01 = scan.nextInt();
        System.out.print("Enter Your Mark Subject 02 : ");
        int subject02 = scan.nextInt();
        System.out.print("Enter Your Mark Subject 03 : ");
        int subject03 = scan.nextInt();

        if ((subject01 >= 35)&&(subject02 >= 35)&& (subject03 >= 35)) {
            System.out.println("Excellent your Pass !!!");
        }
        else {
            System.out.println("Fail . Don't Lose Hope ! Learn From Mistakes And Bounce Back !!!!");
        }
    }
}
