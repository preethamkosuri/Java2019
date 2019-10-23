package M8.BankManager;
class Savings extends BankAccount{
    int n;

    public Savings(String accno, Double balance, int n) {
        super(accno, balance);
        this.n = n;
    }

    @Override
    public String toString() {
        return super.toString() + ", no of transactions:" + n;
    }
    
}