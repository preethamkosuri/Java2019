package M8.BankManager;
class Cod extends BankAccount{
    String date;

    public Cod(String accno, Double balance, String date) {
        super(accno, balance);
        this.date = date;
    }

    @Override
    public String toString() {
        return super.toString()+", Expiry date is:  " + date;
    }
    
}