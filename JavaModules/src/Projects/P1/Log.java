package Projects.P1;

import java.util.ArrayList;

public class Log implements java.io.Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 7229842416058040894L;
    String name;
    ArrayList<Cart> detail;

    public Log() {
    }

    public Log(String name, ArrayList<Cart> detail) {
        this.name = name;
        this.detail = detail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Cart> getDetail() {
        return detail;
    }

    public void setDetail(ArrayList<Cart> detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Log [detail=" + detail + ", name=" + name + "]";
    }
    
}