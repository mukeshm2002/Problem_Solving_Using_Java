import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {10,20,30,40,50,60,70,80,90};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
