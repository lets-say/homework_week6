package homework;
/*
Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
 Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
import java.util.Scanner;
public class Rectangle{
    public void perimeter() {  // instance area
        Scanner scanner = new Scanner(System.in); // create a new  scanner
        System.out.println(" Please enter the value of height: ");
        double height = scanner.nextDouble();
        System.out.println("Please enter the value of width: ");
        double width = scanner.nextDouble();
        double area = (height * width);// formula
        double perimeter= 2*(height+width); // formula
        System.out.println("Area is 5.5*8.5= " + area);
        System.out.println("perimeter is 2*(5.5+8.5)= "+ perimeter);
    }

    public static void main(String[] args) { // main method
        Rectangle obj= new Rectangle();
        obj.perimeter();
    }

}
