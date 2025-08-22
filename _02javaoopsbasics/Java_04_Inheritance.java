package _02javaoopsbasics;

//? Base class
class Vehicle{
    String numberOfVehicle;
    public Vehicle(String numberOfVehicle){
        this.numberOfVehicle = numberOfVehicle;
    }

    public void honk(){
        System.out.println("Honk!!!!!!!!");
    }

    public void printNumberOfVehicle(){
        System.out.println(numberOfVehicle);
    }
}

//? Derived classes
class Car extends Vehicle{
    // private String numberOfCar;

    // public Car(String numberOfCar){
    //     this.numberOfCar = numberOfCar;
    // }

    // public void printCarNumber(){
    //     System.out.println(numberOfCar);
    // }

    // public void honk(){
    //     System.out.println("Honk!!!!!!!!");
    // }

    public Car(String numberOfCar){
        super(numberOfCar);
    }
}

//? Derived classes
class Bus extends Vehicle{
    // private String numberOfBus;

    // public Bus(String numberofBus){
    //     this.numberOfBus = numberofBus;
    // }

    // public void printBusNumber(){
    //     System.out.println(numberOfBus);
    // }

    // public void honk(){
    //     System.out.println("Honk!!!!!!!!");
    // }

    public Bus(String numberOfBus){
        super(numberOfBus);
    }
}

public class Java_04_Inheritance {
    public static void main(String[] args){
        //! Inheritance : 
        Car car = new Car("KA01KJ9876");
        // car.printCarNumber();
        car.printNumberOfVehicle();
        car.honk();

        Bus bus = new Bus("KA08JU7643");
        // bus.printBusNumber();
        car.printNumberOfVehicle();
        bus.honk();
    }
}
