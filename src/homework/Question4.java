package homework;
/* 4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme

 */
public class Question4 {  // this is class
    int a=12; // instance variable
    int b=15; // instance variable
    static int c=20; // static variable
    static int d=30; // static variable

    public static void main(String[] args) {   // this is main method
        Question4 obj= new Question4(); // object
        System.out.println(obj.a); // access with object
        System.out.println(obj.b); // access with object
        System.out.println(c); // direct access
        System.out.println(Question4.d); // acess with class name
        obj.test();
        myMethod();
    }
    // this is instance method
    public void test(){
        Question4 t = new Question4();
        System.out.println(a); // direct access
        System.out.println(t.b); // access with object
    }
      // this is static method
    public static void myMethod(){
        System.out.println(c); // direct access
        System.out.println(Question4.d);// access with class name
    }
}

