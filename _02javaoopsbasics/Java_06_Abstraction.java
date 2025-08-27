package _02javaoopsbasics;

abstract class BankAccount{
    double balance;
    abstract void addMoney(double amount);   //? Abstract method
    abstract void canUserWithdrawMoney(double amount);

    void updateBalance(double _balance){
        balance = _balance;
    }

    public double getBalance(){
        return balance;
    }
}
class SavingsAccount extends BankAccount{
    public void addMoney(double amount){
        super.updateBalance(super.getBalance() + amount);
    }

    public void canUserWithdrawMoney(double amount){
        if(amount <= super.getBalance()){
            System.out.println("User can");
        }
        else{
            System.out.println("User cannot");
        }
    }
}
class CurrentAccount extends BankAccount{
    double minimumLimit = 1000.0;
    public void addMoney(double amount){
        super.updateBalance(super.getBalance() + amount);
    }

    public void canUserWithdrawMoney(double amount){
        if(super.getBalance() - amount >= minimumLimit){
            System.out.println("User can");
        }
        else{
            System.out.println("User cannot");
        }
    }
}
public class Java_06_Abstraction {
    public static void main(String[] args){
        //! Abstraction :
        //* Abstraction is a core concept of Object-Oriented Programming (OOP) in Java that focuses on hiding complex implementation details and 
        //* exposing only the essential features of an object or method. It helps simplify programming by only showing what is necessary and keeping internal workings hidden.
        //? we can't create an object of abstract class

        SavingsAccount savingaccount = new SavingsAccount();
        savingaccount.updateBalance(1000);
        savingaccount.addMoney(500);
        savingaccount.canUserWithdrawMoney(200);
        System.out.println(savingaccount.getBalance());

        CurrentAccount currentaccount = new CurrentAccount();
        currentaccount.updateBalance(2000);
        currentaccount.addMoney(800);
        currentaccount.canUserWithdrawMoney(300);
        System.out.println(currentaccount.getBalance());
    }
}
