package _02javaoopsbasics;
class Test{
    public Test(){    //! Constructor
        System.out.println("test constructor called");
    }
    public void printHello(){
        System.out.println("Hello");
    }
}
class BankAccount{
    double balance;
    String accountType;
    // public BankAccount(){   //? default Constructor
    //     balance = 100;
    // }
    public BankAccount(double _balance){    //? parameterized Constructor
        balance = _balance;
        accountType = "Savings";
    }
    public BankAccount(double balance, String accountType){
        this.balance = balance;      //! this keyword --> Distinguishing between instance variables and local variables/parameters
        this.accountType = accountType;  //? so by using this keyword, we don't need to write parameters name like _balance 
    }

    public void printBalance(){
        System.out.println(balance);
    }
    public void printAccountType(){
        System.out.println(accountType);
    }
}
public class Java_02_Constructor {
    public static void main(String args[]){
        //! Constructors :
        // Test test = new Test();   //? Default constructor (system's)  [before making constructor in Test class]

        // Test test = new Test();   //? Our own default constructor
        // test.printHello();

        //* Constructor is use when we need to start with our own custom default values or things
        //* Eg : 
        // BankAccount account = new BankAccount();
        // account.printBalance();
        //? Here, we want balance = 100 evenwhere the object. so it's done by using constructor
        //? Without constructor, balance will printed as 0.0 or garabage value 

        //! Parameterized Constructor
        // BankAccount account = new BankAccount(200.0);
        // account.printBalance();

        //! we can have multiple Constructor
        BankAccount accountPerson1 = new BankAccount(200.0);
        accountPerson1.printBalance();
        accountPerson1.printAccountType();

        BankAccount accountPerson2 = new BankAccount(300.0, "Current");
        accountPerson2.printBalance();
        accountPerson2.printAccountType();
    }
}
