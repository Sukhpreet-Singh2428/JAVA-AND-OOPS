package _02javaoopsbasics;

//? Base class
class Vehicle{
    String numberOfVehicle;

    public Vehicle(String numberOfVehicle){
        this.numberOfVehicle = numberOfVehicle;
    }

    public void honk(){
        System.out.println("Honk!!!!!!!!!!");
    }

    public void printNumberOfVehicle(){
        System.out.println(numberOfVehicle);
    }
}

//? Derived classes
class Car extends Vehicle{
    public Car(String numberOfCar){
        super(numberOfCar);
    }

    @Override
    public void honk(){
        System.out.println("Give me way !!");
    }
}

//? Derived classes
class Bus extends Vehicle{
    public Bus(String numberOfBus){
        super(numberOfBus);
    }
}
public class Java_05_Polymorphism {
    public static void main(String[] args){
        //! Polymorphism (Override)
        //? The ability of a subclass to provide a specific implementation of a method that is already defined in its parent class.

        Car car = new Car("KA01KJ9876");
        car.printNumberOfVehicle();
        car.honk();

        Bus bus = new Bus("kA08JU7643");
        bus.printNumberOfVehicle();
        bus.honk();
    }
}
