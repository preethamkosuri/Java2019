package M7.Bank;
class BankMain{
    public static void main(String[] args) {
        Savings sa = new Savings(42000, 6.5);
        System.out.println(sa.total());
        Checkings c=new Checkings(20000);
        System.out.println(c.check(1000));
        Account b = new Current(30000, 10);
        b.debit(31500);
        System.out.println(b);
    }
}