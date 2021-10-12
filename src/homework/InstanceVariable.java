package homework;
/*f1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme
*/

// this is a class
public class InstanceVariable {
    int a=10; // instance variable
    int b=15; // instance variable

    // this is main method
    public static void main(String[] args) {



    InstanceVariable obj = new InstanceVariable(); // object
       System.out.println(obj.a); // access with object
       System.out.println(obj.b); // access with object
        obj.test();
        }

        // this is instance method
       public void test(){
       InstanceVariable t = new InstanceVariable();//object
        System.out.println(a); //direct access with instance area
        System.out.println(t.b);// direct  access with object

    }
}
