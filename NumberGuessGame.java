// Number Guessing Game
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("WellCome to Guessing a Number Game Hint 1 to 9 !!!!!");
        System.out.println("Enter Your Guessing Number  :" );
        int GNum = scan.nextInt();
        int Target = 6 ;

        if (Target == GNum) {
            System.out.println("Congrats !!! You Win Identify the Correct Number !!!!");
        }
        else if(Target < GNum) {
            System.out.println("Too Higher Number You Choose Better Luck Next Time !!!!!");
        }
        else {
            System.out.println("Too Smaller Number You Choose Better Luck Next Time !!!!!");
        }
    }
}
