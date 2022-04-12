public class BankAccount implements Account{
    private int balance;

    public BankAccount(int balance){
        this.balance = balance;
    }

    public int deposit(int depositMoney){
        return balance += depositMoney;
    }

    /*
            an implementation of the withdraw method that
            checks whether its parameter is less than or equal
            to the balance and if so, decreases the balance by the value of the
            parameter and returns true; otherwise,
            it leaves the balance unchanged and returns
            false.
     */

    public boolean withdraw(int withdrawMoney){
        if(withdrawMoney < balance){
            balance -= withdrawMoney;
            return true;
        }
        return false;
    }
}
