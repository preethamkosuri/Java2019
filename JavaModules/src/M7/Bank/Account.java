package M7.Bank;
class Account{
    double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(double amount){
        balance=balance+amount;
    }
    public boolean debit(double amount){
        if(balance>amount+10){
            balance=balance-amount-10;
            System.out.println(amount+"amount has been debitted");
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public String toString() {
        return "Account [balance=" + balance + "]";
    }
    
}