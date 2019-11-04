package M7.Bank;
class Current extends Account{

    double maximum_overdraft_limit;

    public Current(double balance, double maximum_overdraft_limit) {
        super(balance);
        this.maximum_overdraft_limit = maximum_overdraft_limit;
    }

    public boolean debit(double amount){
        
    }
}