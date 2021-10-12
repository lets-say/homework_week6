package homework;
/*
 Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)

 */
public class Calculator { // this is class

    public static void main(String[] args) { // main method
        Calculator obj = new Calculator();
        int answer= obj.addition(15,25);
        String result= obj.name("Addition of a+b is ");
        System.out.print(result);
        System.out.println(answer);
        String result1= obj.name("Division of a/b is ");
        System.out.print(result1);

      division();
        String result3= obj.name("Subtraction of a-b is ");
        System.out.print(result3);
      Calculator obj1= new Calculator();
      obj1.subtraction(50,30);
      Calculator obj2=new Calculator();
        String result4= obj.name("multiplication of a*b is ");
        System.out.print(result4);
      obj2.multiplication(5,6);



    }
    // With return type with parameters
    public int addition(int a, int b){
        int result= a+b;
        return result;
    }
       // string method
    public String name(String var){
        String name=var;
        return name;
    }
    // with return type no parameter
    public static int division(){
        int a= 30;
        int b= 10;
        int result = a/b;
        System.out.println(result);
        return result;

    }
      // with return type with parameters
    public int subtraction(int a, int b){
        int result = a-b;
        System.out.println(result);
        return result;

    } // with return type with parameters
    public int multiplication(int a, int b){
        int result= a*b;
        System.out.println(result);
        return result;
    }
}
