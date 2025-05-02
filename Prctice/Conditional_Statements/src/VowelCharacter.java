import java.util.Scanner;

public class VowelCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Any Character :");
        char ch = scan.next().charAt(0);

        //Using Wrapper Class Character.toLowerCase() And Character.isLetter()

        switch (Character.toLowerCase(ch)){
            case 'a': case 'e': case 'i': case 'o':case 'u':
                System.out.println("Vowel");
                break;
            default:
                if (Character.isLetter(ch)) {
                    System.out.println("Constant");
                }
                else {
                    System.out.println("Not an Alphabet");
                }
        }
    }
}
