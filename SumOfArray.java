import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {10,20,30,40,50,60,70,80,90};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of Array Elements = "+ sum);
    }
}
