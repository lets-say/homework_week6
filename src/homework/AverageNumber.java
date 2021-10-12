package homework;
/*
Write a Java program that takes three numbers as input to calculate and
 print the average of the numbers.*/

public class AverageNumber { // this is class


    public static void main(String[] args) { // main method

      int sum;
        int a = 20; // variable
        int b = 30;
        int c = 10;

         double average;
        sum = a + b + c;
         average = sum / 3;
        System.out.println("Average: "+average);
    }
}
