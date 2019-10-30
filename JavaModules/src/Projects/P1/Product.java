package Projects.P1;
public class Product implements java.io.Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    int pid,qty,price;

    public Product() {
        pid = 0;
        qty = 0;
        price = 0;
    }

    public Product(int pid, int qty, int price) {
        this.pid = pid;
        this.qty = qty;
        this.price = price;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getPid() {
        return pid;
    }

    public void setPname(int pid) {
        this.pid = pid;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product Id: " + pid + ", price: " + price + ", qty: " + qty;
    }
    
    
}