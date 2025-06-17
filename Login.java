import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter User Name : ");
        String UName = scan.next();
        System.out.print("Enter Password : ");
        String Upassword = scan.next();

        String CorrectUser = "mukesh2002";
        String CorrectPassword = "mukesh12345";

        if (UName.equals(CorrectUser) && Upassword.equals(Upassword)){
            System.out.println("Login Successful!!!");
        }
        else {
            System.out.println("Invalid Credential!!!!");
        }
    }
}
