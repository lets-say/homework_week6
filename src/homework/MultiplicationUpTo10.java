package homework;
/*
. Write a Java program that takes a number as input and prints its
multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80

 */
import java.util.Scanner;  // import scanner

public class MultiplicationUpTo10 {  // this is class
    public void UpTo10() {  // instance area
        Scanner scanner = new Scanner(System.in); // create a new scanner
        System.out.println("Input a number");
        int num1 = scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(num1 + " x " + (i + 1) + "=" + (num1 * (i + 1)));
        }


    }

    public static void main(String[] args) {  // this is main method
        MultiplicationUpTo10 num= new MultiplicationUpTo10();   // object
        num.UpTo10();

    }
}
