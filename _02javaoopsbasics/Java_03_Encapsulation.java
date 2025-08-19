package _02javaoopsbasics;

class BankAccount{
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public void setBalance(double balance){    //! setter
        this.balance = balance;
    }

    public double getBalance(){           //! getter
        //? logic of checking if he is a bank employee
        return balance;
    }

    public void printBalance(){
        System.out.println(balance);
    }
}
public class Java_03_Encapsulation {
    public static void main(String[] args){
        //! Encapsulation : 
        //* Hiding the data 
        //? Binding the data and method together i.e, encapsulate it 
        //? hiding the data from outsiders, and only access by using methods or change using method under some condition only 
        BankAccount accountPerson1 = new BankAccount(200.0);
        accountPerson1.setBalance(900);
        accountPerson1.printBalance();
    }
}
