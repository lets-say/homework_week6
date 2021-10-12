package homework;
/*
  Write a Java program to convert a decimal number to binary number.
Input Data:
 Input a Decimal Number : 5
Expected Output
Binary number is: 101
 */
import java.util.Scanner; // import scaner
public class DecimalToBinary { // this is class

    public void decimal() { // instance area
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter decimal number: ");
        int decimal= scaner.nextInt();
        System.out.println("Enter number "+decimal+" correspond to binary"+(Integer.toBinaryString(decimal))+".");
    }

    public static void main(String[] args) { // main method
        DecimalToBinary obj= new DecimalToBinary();
        obj.decimal();
    }
}
