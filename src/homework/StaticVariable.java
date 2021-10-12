package homework;
/* 2. Write a Java programme using the following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme.*/
// this is main method
public class StaticVariable {
    static int a =10; // static variable
    static int b =12; // static variable

    public static void main(String[] args) {
        System.out.println(a); // direct access
        System.out.println(b); // direct access
        test();
    }
       // this is static method
    public static void test(){
        System.out.println(a); // direct access
        System.out.println(StaticVariable.b); // access with class name
    }
}
