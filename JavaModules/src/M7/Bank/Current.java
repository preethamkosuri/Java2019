package M7.Bank;
class Current extends Account{

    double maximum_overdraft_limit;

    public Current(double balance, double maximum_overdraft_limit) {
        super(balance);
        this.maximum_overdraft_limit = maximum_overdraft_limit;
    }

    public boolean debit(double amount){
        if(amount <= calculateOverDraftLimit()) {
            balance -= amount;
            return true;
        }
        else {
            System.out.println("The transaction cannot happen as it exceeded the maximum overdraft limit.");
            return false;
        }
    }

    private double calculateOverDraftLimit(){
        return getBalance()+((getBalance()*maximum_overdraft_limit)/100);
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "maximum_overdraft_limit=" + maximum_overdraft_limit +
                ", balance=" + balance +
                '}';
    }
}