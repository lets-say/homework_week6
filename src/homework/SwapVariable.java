package homework;
// . Write a Java program to swap two variables.
public class SwapVariable { // this is class
    public static void main(String[] args) { // main method

        int a = 20; // variable
        int b = 12; // variable

        System.out.println("Before swapping: a,b= "+a+"," + + b);
         a= a+b;
         b=a-b;
         a=a-b;
        System.out.println("after swap: a,b = "+a+","+ + b);
    }

}
