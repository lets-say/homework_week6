package homework;
/*
Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).

 */
import java.util.Scanner; // import scanner
public class Fahrenheit { // this is class

  void temperature(){ // instance area

        System.out.println("Please enter temperature in fahrenheit: ");
        Scanner scanner = new Scanner(System.in); // create a new scanner
        float fahrenheit = scanner.nextFloat();
        float celsius = (fahrenheit -32)* 5/9; // formula
        System.out.println(fahrenheit +"degree fahrenheit is " + celsius+ "in celsius");
    }

    public static void main(String[] args) { // this is main method
        Fahrenheit obj = new Fahrenheit();// object
        obj.temperature();
    }
}
