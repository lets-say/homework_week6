package homework;
/*
  Write a Java program to convert a given string into lowercase.
 Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 Output: the quick brown fox jumps over the lazy dog.
 */



import java.util.Scanner; // import a scanner

public class StringToLowerCase { //this is class
    public void string(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("please input a string: ");
        String line = scanner.nextLine();
        line = line.toLowerCase();
        System.out.println(line);

    }

    public static void main(String[] args) { // main method
        StringToLowerCase obj = new StringToLowerCase(); // access object
        obj.string();
    }
}
