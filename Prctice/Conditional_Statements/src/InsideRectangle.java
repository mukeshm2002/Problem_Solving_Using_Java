//Point Inside Rectangle

import java.util.Scanner;

public class InsideRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Coordinates of first corner of rectangle (x1 y1) : ");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.println("Enter Coordinates of opposite corner of rectangle (x2 y2) : ");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        //Input Test Point
        System.out.println("Enter coordinates of the point to check(px py) : ");
        int px = scan.nextInt();
        int py = scan.nextInt();

        //check if point is inside or on boundary

        if (px >= Math.min(x1,x2) && px <= Math.max(x1, x2) && py >= Math.min(y1,y2) && py <= Math.max(y1,y2) ) {
            System.out.println("The point (" + px +"," + py + ") lies inside the rectangle.");
        }
        else {
            System.out.println("The point (" + px + "," + py + ") lies outside the rectangle. ");
        }
    }
}
