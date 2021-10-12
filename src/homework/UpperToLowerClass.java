package homework;
//Write a program to convert the upper case to lower case.

/*
public static void main(String[] args) {

        String name = "kavan";

        System.out.println(name.toUpperCase());
    }
 */
import java.util.Scanner; // import scanner

public class UpperToLowerClass { // this is class
       char letter;
       int temp;

    public void upper() {
        Scanner scanner = new Scanner(System.in);
        letter = scanner.next().charAt(0);
        System.out.println("Please enter Upper case character");
        temp = (int) letter;
        temp = temp + 32;
        letter = (char) temp;
        System.out.println("Enter character in lower case=" + letter);

    }

    public static void main(String[] args) { // main method
        UpperToLowerClass obj = new UpperToLowerClass();// object
        obj.upper();
        System.out.println("Please enter Upper case character");
    }
}
