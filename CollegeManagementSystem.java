import java.util.Scanner;

public class CollegeManagementSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Section = scan.nextInt();
        System.out.println("Enter your Option");
        int Option = scan.nextInt();

        switch (Section) {
            case 1:
                switch (Option) {
                    case 1:
                        System.out.println("Add Student");
                        break;
                    case 2:
                        System.out.println("View Student");
                        break;
                    default:
                        System.out.println("Invalid Student");
                }
                break;
            case 2:
                switch (Option) {
                    case 1:
                        System.out.println("Add Course");
                        break;
                    case 2:
                        System.out.println("View Course");
                        break;
                    default:
                        System.out.println("Invalid Course");
                        break;
                }
                break;
            default:
                System.out.println("Invalid Section");
        }
    }
}
