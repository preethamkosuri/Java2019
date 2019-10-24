package M7.Bank;
class Savings extends Account{
    double interest;

    public Savings(double balance, double interest) {
        super(balance);
        this.interest = interest;
    }
    public double total() {
        
        return (balance*interest)/100;
    }

    @Override
    public String toString() {
        return "Savings [interest=" + interest + "]";
    }
    

}