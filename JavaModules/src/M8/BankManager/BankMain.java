package M8.BankManager;

class BankMain {
    public static void main(String[] args) {

        Savings s=new Savings("s12345",1234569.00, 5);
        System.out.println(s.toString());

        Checking c=new Checking("c4567839",2345679.00, 40000.00);
        System.out.println(c.toString());


        Cod co=new Cod("co425673", 455678.00,"11/1/2020");
        System.out.println(co.toString());
}
}