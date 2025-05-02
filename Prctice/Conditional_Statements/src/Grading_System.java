//Create Nested If-else to simulate a grading system (A, B, C, D, F)

import java.util.Scanner;

public class Grading_System {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Mark : ");
        double mark = scan.nextDouble();
        char grade;
        String comment;

        //Grade A(90 - 100 ) - "Excellent Performance ! Keep Up the Great Work!"
        //Grade B(80 - 89)   - "Great Effort ! You Can Reach Higher With a Bit More push !"
        //Grade C(50 - 79)   -  "Nice Work ! Focus a Bit More for Better Results !"
        //Grade D(35 - 49)   -  "You Passed. Work Harder and Don't Give Up !"
        //Grade  F(0 - 34)   -  "Fail . Don't Lose Hope ! Learn From Mistakes And Bounce Back !"


        if (mark >= 0 && mark <= 100){
           if (mark >= 90){
               grade = 'A' ;
               comment  = "Excellent Performance ! Keep Up the Great Work!";
            }
           else {
               if (mark >= 80){
                   grade = 'B';
                   comment = "Great Effort ! You Can Reach Higher With a Bit More push !";
               }
               else {
                   if (mark >= 50){
                       grade = 'C';
                       comment = "Nice Work ! Focus a Bit More for Better Results ! ";
                   }
                   else {
                       if (mark >= 35){
                           grade = 'D';
                           comment = "You Passed. Work Harder and Don't Give Up !";
                       }
                       else {
                           grade = 'F';
                           comment = "Fail . Don't Lose Hope ! Learn From Mistakes And Bounce Back !";
                       }
                   }
               }
           }
            System.out.println("Grade : " + grade +" "+ comment);
        }else {
            System.out.println("Invalid Marks! Please Enter Marks Between 0 to 100");
        }
    }
}
