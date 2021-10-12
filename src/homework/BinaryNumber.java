package homework;
/*
  Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:
Sum of two binary numbers: 101
 */

public class BinaryNumber {  // this is class


    public static void main(String[] args) {
         byte binary1=0b10;
        byte binary2=0b11;
        int result;
       result=binary1+binary2;
        System.out.println(binary1+binary2);
        System.out.println(Integer.toBinaryString(result));
    }




}
