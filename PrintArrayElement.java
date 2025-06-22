import java.util.Scanner;

public class PrintArrayElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {10,20,30,40,50,60,70,80,90};

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element "+i+":"+arr[i]);
        }
    }
}
