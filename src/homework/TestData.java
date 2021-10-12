package homework;
/*
 Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */
import java.util.Scanner; // import scaner
public class TestData {  // this is class
    public void data(){  // instance area

        Scanner scanner =new Scanner(System.in);
        System.out.print("Input first number: ");
        int n1=scanner.nextInt();
        System.out.print("Input second number: ");
        int n2=scanner.nextInt();

        System.out.println(n1+"+"+n2+"="+(n1+n2));
        System.out.println(n1+"-"+n2+"="+(n1-n2));
        System.out.println(n1+"*"+n2+"=" +n1*n2);
        System.out.println(n1+"/"+n2+"=" +n1/n2);
        System.out.println(n1+"mod"+n2+"=" +n1%n2);
    }

    public static void main(String[] args) { // main method
        TestData obj=new TestData();      // access with object
        obj.data();
    }
}
