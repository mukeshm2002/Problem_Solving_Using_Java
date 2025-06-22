import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Value : ");
        int num = scan.nextInt();

        int count = 0;

        while (num != 0){
            count ++ ;
            num/=10;
        }
        System.out.println("Number of digit : " + count);
    }
}
