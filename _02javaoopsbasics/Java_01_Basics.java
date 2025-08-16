package _02javaoopsbasics;
class Test{
    // public static void printTest(){
    //     System.out.println("Hello");
    // }
    // public void printTest(){
    //     System.out.println("Hello");
    // }

    // int age;  //? By default, arguments are public if we don't define access specifier to it
    // public void assignAge(int num){
    //     age = num;
    // }

    public int sum(int num1, int num2){
        return num1+num2;
    }
}
public class Java_01_Basics {
    // private static int num(){   //? it can't be access from outside the JavaOOPsBasics class
    //     return 10;
    // }
    public static void main(String[] args){
        //? Access Specifiers
        //? public --> everywhere
        //? private --> current class
        //? protected --> current package and all other sub packages

        //* main is the entry point <-- main method
        //! static --> static is a keyword which allows to use method without creating object
        //! void --> this method doesn't need to return anything
        //! main --> function name, main is entry point [main method]
        //! String[] args --> command line arguments. if we taking input from command line 

        //? Test Class implementation :
        // Test.printTest();  //* here we doesn't need to create object bcz we use static keyword in method of test class
        //? if we doesn't use static then we need to create object first in order to use its methods
        // Test test = new Test();
        // test.printTest();

        //! class : blueprint
        //! object : instance of class

        //? Objects : 
        //? why do we need objects
        // Test test1 = new Test();
        // test1.assignAge(10);

        // Test test2 = new Test();
        // test2.assignAge(19);

        // System.out.println(test1.age);  //? 10
        // System.out.println(test2.age);  //? 19


        //! Methods / functions 
        //? main is method
        //? assignAge is method 
        //? num is method
        // System.out.println(num());  //? num method

        //* parameterized method
        Test test = new Test();
        System.out.println(test.sum(10, 15));
    }
}
