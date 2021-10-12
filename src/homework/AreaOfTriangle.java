package homework;

   //  Write a program to calculate the area of a triangle
import java.util.Scanner; // Import scanner

public class AreaOfTriangle { //this is class
     public void triangle(){  // instance area
        Scanner scanner = new Scanner(System.in); // create a new  scanner
        System.out.println(" Please enter the value of height: ");
        double height = scanner.nextDouble();
        System.out.println("Please enter the value of width: ");
        double width = scanner.nextDouble();
        double area = (height*width)/2;// formula
        System.out.println("Area of triangle is: "+ area);
    }

    public static void main(String[] args) { // this is main method
          AreaOfTriangle obj = new AreaOfTriangle();// object
          obj.triangle();

    }
}
