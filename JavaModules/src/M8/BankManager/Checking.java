package M8.BankManager;
class Checking extends BankAccount{
    double limit;

    public Checking(String accno, Double balance, double limit) {
        super(accno, balance);
        this.limit = limit;
    }

    @Override
    public String toString() {
        return super.toString()+", Checking limit:  " + limit ;
    }
    
}