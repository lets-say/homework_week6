package homework;
/*
Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r)
 */
import java.util.Scanner; // import scanner
public class CircleRadius {  // this is class
public static void myRadius(){  // static area
     Scanner scanner= new Scanner(System.in); // create a new scanner
    System.out.println("Please enter the value of radius");
    double radius = scanner.nextDouble();
    double area = Math.PI*radius*radius; // formula
    System.out.println("Area of circle is: "+ area);

}
    public static void main(String[] args) { // this is main method
       myRadius();
    }



}
