package _02javaoopsbasics;

interface Animal{
    void bark();   //? By Defaults it's abstract method 
    default void sleep(){
        System.out.println("Sleeping....");
    }
}
interface Pet{
    void ownerName();
}
class Dog implements Animal, Pet{
    public void bark(){
        System.out.println("Bark!!!");
    }
    
    public void sleep(){
        System.out.println("Dog is Sleeping !!!");
    }

    public void ownerName(){
        System.out.println("XYZZZZ!!!!!");
    }
}
class Cat implements Animal{
    public void bark(){
        System.out.println("Meowwww!!");
    }
}
public class Java_07_Interface {
    public static void main(String[] args){
        //! Interface
        //* In Java, abstraction can also be achieved using interfaces. An interface is a completely abstract type that defines a contract for classes to implement. 
        //* It contains only abstract methods (prior to Java 8), which must be implemented by any class that "implements" the interface. From Java 8 onwards, 
        //* interfaces can also contain default and static methods with implementation.
        //? Pure Abstraction: An interface only defines what methods should be present; the actual implementation is provided by the classes that implement the interface.

        Dog dog = new Dog();
        dog.bark();
        dog.sleep();
        dog.ownerName();

        Cat cat = new Cat();
        cat.bark();
        cat.sleep();
    }
}
