package Projects.P1;
public class Cart{
    int pid,qyt,price;

    public Cart() {
    }

    public Cart(int pid, int qyt, int price) {
        this.pid = pid;
        this.qyt = qyt;
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getQyt() {
        return qyt;
    }

    public void setQyt(int qyt) {
        this.qyt = qyt;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cart [pid=" + pid + ", price=" + price + ", qyt=" + qyt + "]";
    }
    
}