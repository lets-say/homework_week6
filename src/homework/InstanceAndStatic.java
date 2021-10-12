package homework;
/*   Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class InstanceAndStatic {   // this is class
    int a=10; // instance variable
    static int b=15; // static variable

    public static void main(String[] args) {  //this is main method

        InstanceAndStatic obj = new InstanceAndStatic();
        System.out.println(obj.a);
        System.out.println(InstanceAndStatic.b);// access with class
        obj.test();
        myMethod();


    }
    // this is instance method
    public void test() {
        InstanceAndStatic t = new InstanceAndStatic();
        System.out.println(a);// direct access
    }
    // this is static method
    public static void myMethod(){
        System.out.println(InstanceAndStatic.b); // access with class

    }
}
