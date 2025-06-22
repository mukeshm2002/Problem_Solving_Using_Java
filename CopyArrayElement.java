import java.util.Scanner;

public class CopyArrayElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] original = {10,20,30,40,50,60,70,80,90};
        int[] copy = new int[original.length] ;

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        System.out.println("Copied Array : ");
        for (int num : copy) {
            System.out.println(num + "");
        }

    }
}
