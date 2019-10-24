package M7.Bank;
class Checkings extends Account{
    int n=0;

    public Checkings(double balance) {
        super(balance);
    }
    public boolean check(double amount) {
        if(balance>amount+10){
            return true;
        }
        else{
            return false;
        }
    }
    

    @Override
    public String toString() {
        return "Checkings [n=" + n + "]";
    }
    
    
}