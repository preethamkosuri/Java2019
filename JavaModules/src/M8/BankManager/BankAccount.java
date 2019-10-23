package M8.BankManager;
class BankAccount{
    String accno;
    Double balance;

    public BankAccount(String accno, Double balance) {
        this.accno = accno;
        this.balance = balance;
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank Account numner:" + accno + ", balance:" + balance;
    }
    
}