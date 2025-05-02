//Simulate Traffic light rules based on color input(Red,Yellow,Green)

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your Traffic light Color : ");
        String color = scan.next();

        if(color.equalsIgnoreCase( "Red")){
            System.out.println("Stop !");
        } else if (color.equalsIgnoreCase("Yellow") ) {
            System.out.println("Ready !!!");
        }
        else if (color.equalsIgnoreCase("green") ){
            System.out.println("Go !!!!!!!");
        }
        else {
            System.out.println("please Enter Correct color like Red, Yellow, Green ");
        }
    }
}
