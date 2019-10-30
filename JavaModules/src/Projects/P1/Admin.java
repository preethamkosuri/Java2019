package Projects.P1;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    
    public void addPro(int pid, int qty, int price) {
        Product p = new Product(pid, qty, price);
        ArrayList<Product> pro = Productfile.readPrducts();
        if (pro == null)
            pro = new ArrayList<Product>();
        pro.add(p);
        Productfile.writeProduts(pro);
        //System.out.println(Productfile.readPrducts());
    }
    public void update(int pid,int n2,int n3){
        ArrayList<Product> pro = Productfile.readPrducts();
        if(n2==1){
            int i=pro.get(pid-1).getQty();
            pro.get(pid-1).setQty(i+n3);
            Productfile.writeProduts(pro);
        }
        else{
            pro.get(pid-1).setPrice(n3);
            Productfile.writeProduts(pro);
        }
    }
    public void viewlogs(){
        ArrayList<Log> pro = Productfile.readLogs();
        for(int i = 0; i < pro.size(); i++) {   
            System.out.println(pro.get(i));
        }  
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Admin a=new Admin();
        System.out.println("enter 1 to add product,2 to update product or 3 lor logs:");
        int op=sc.nextInt();
        if(op==1){
            System.out.println("enter the product Id:");
            int pid=sc.nextInt();
            System.out.println("enter the product price:");
            int price=sc.nextInt();
            System.out.println("enter the quantitty available:");
            int qty=sc.nextInt();
            a.addPro(pid, qty, price);
        }
        else if(op==2){
            System.out.println("enter the product Id:");
            int pid=sc.nextInt();
            ArrayList<Product> pro = Productfile.readPrducts();
            System.out.println(pro.get(pid-1));
            System.out.println("enter 1 to update quantity or 2 to update price");
            int n2=sc.nextInt();
            if(n2==1){
                System.out.println("enter new additional quantity:");
                int n3=sc.nextInt();
                a.update(pid,n2,n3);
            }
            else{
                System.out.println("enter new price:");
                int n3=sc.nextInt();
                a.update(pid,n2,n3);
            }
        

        }
        else{
            a.viewlogs();
            

        }
        sc.close();
        
    }
    
}